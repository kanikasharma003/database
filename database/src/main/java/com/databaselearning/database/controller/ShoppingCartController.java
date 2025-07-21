package com.databaselearning.database.controller;

import com.databaselearning.database.model.ShoppingCart;
import com.databaselearning.database.service.ShoppingCartService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/shopping")
public class ShoppingCartController {
   @Autowired
   private ShoppingCartService shoppingCartService;
   @PostMapping("/createShoppingCart")
   public ShoppingCart cereteShoppingCart(@RequestBody ShoppingCart shoppingCart ){
    return shoppingCartService.createShoppingCart(shoppingCart);
   }
}
