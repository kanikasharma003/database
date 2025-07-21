package com.databaselearning.database.repository;

import com.databaselearning.database.model.ShoppingCart;
import com.databaselearning.database.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {

}
