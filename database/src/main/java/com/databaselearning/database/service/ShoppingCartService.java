package com.databaselearning.database.service;

import com.databaselearning.database.model.ShoppingCart;
import com.databaselearning.database.model.Student;
import com.databaselearning.database.repository.ShoppingCartRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {
    private static final Logger logger = LoggerFactory.getLogger(ShoppingCartService.class);
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public ShoppingCart createShoppingCart(ShoppingCart shoppingCart) {

        logger.info("Creating shoppingCart: {}", shoppingCart);
        shoppingCartRepository.save(shoppingCart);
        logger.info("Created shoppingCart: {}", shoppingCart);
        return shoppingCart;
    }
}
