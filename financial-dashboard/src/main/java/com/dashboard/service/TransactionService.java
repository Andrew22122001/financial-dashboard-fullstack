package com.dashboard.service;

import com.dashboard.model.Transaction;
import com.dashboard.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repository;

    public List<Transaction> getTransactionsByRole(String role) {
        return repository.findByRole(role);
    }

    public Transaction save(Transaction tx) {
        return repository.save(tx);
    }

    public List<Transaction> getAll() {
        return repository.findAll();
    }

    public Transaction findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
