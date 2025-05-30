package com.dashboard.controller;

import com.dashboard.model.Transaction;
import com.dashboard.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@CrossOrigin(origins = "*")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @GetMapping
    public List<Transaction> getAll() {
        return service.getAll();
    }

    @GetMapping("/{role}")
    public List<Transaction> getByRole(@PathVariable String role) {
        return service.getTransactionsByRole(role);
    }

    @PostMapping
    public Transaction create(@RequestBody Transaction tx) {
        return service.save(tx);
    }

    @PutMapping("/{id}")
    public Transaction updateTransaction(@PathVariable Long id, @RequestBody Transaction updatedTx) {
        Transaction existing = service.findById(id);
        if (existing == null) {
            throw new RuntimeException("Transaction not found with ID: " + id);
        }

        existing.setFundName(updatedTx.getFundName());
        existing.setType(updatedTx.getType());
        existing.setAmount(updatedTx.getAmount());
        existing.setRole(updatedTx.getRole());

        return service.save(existing);
    }

    @DeleteMapping("/{id}")
    public String deleteTransaction(@PathVariable Long id) {
        service.deleteById(id);
        return "Transaction deleted with ID: " + id;
    }
}
