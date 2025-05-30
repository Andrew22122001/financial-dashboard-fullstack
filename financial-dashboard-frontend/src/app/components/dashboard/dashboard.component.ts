import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { DashboardService } from '../../services/dashboard.service';
import { Transaction } from '../../models/transaction.model';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  transactions: Transaction[] = [];
  newTransaction: Transaction = { fundName: '', type: '', amount: 0, role: '' };

  constructor(private dashboardService: DashboardService) {}

  ngOnInit(): void {
    this.loadTransactions();
  }

  loadTransactions(): void {
    this.dashboardService.getAllTransactions().subscribe(data => {
      this.transactions = data;
    });
  }

  addTransaction(): void {
    this.dashboardService.addTransaction(this.newTransaction).subscribe(() => {
      this.newTransaction = { fundName: '', type: '', amount: 0, role: '' };
      this.loadTransactions();
    });
  }

  updateTransaction(tx: Transaction): void {
    if (!tx.id) return;
    this.dashboardService.updateTransaction(tx.id, tx).subscribe(() => this.loadTransactions());
  }

  deleteTransaction(id: number): void {
    this.dashboardService.deleteTransaction(id).subscribe(() => this.loadTransactions());
  }
}