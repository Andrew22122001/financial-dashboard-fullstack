package com.dashboard.repository;

import com.dashboard.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByRole(String role);  // Allows filtering by user role
}
