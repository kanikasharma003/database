package com.databaselearning.database.repository;

import com.databaselearning.database.model.Bank;
import com.databaselearning.database.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {
}
