package com.databaselearning.database.controller;


import com.databaselearning.database.dto.BankDto;
import com.databaselearning.database.dto.StudentDto;
import com.databaselearning.database.model.Bank;
import com.databaselearning.database.model.Student;
import com.databaselearning.database.service.BankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class BankController {
    private static final Logger logger = LoggerFactory.getLogger(BankController.class);

    @Autowired
    private BankService bankService;
    @PostMapping("/createBank")
    public Bank createBank(@RequestBody  Bank bank){
        logger.info("Creating bank: {}", bank);
        return this.bankService.createBank(bank);
    }
    @GetMapping("getById")
    public BankDto getById(@RequestParam String bankId){
        logger.info("calling bank service with bankId {} for bank details " , bankId);
        Bank bank = bankService.createBankById(bankId);
         return new BankDto(bank);

    }

}


