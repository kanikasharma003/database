package com.databaselearning.database.dto;

import com.databaselearning.database.model.Bank;
import lombok.Data;

@Data
public class BankDto {
    private String name;
    private String branch;
    private int create_account;
    private int update_account;
    private int customerCare;
    private double interestRate;

    public  BankDto(Bank bank){
        this.name = bank.getName();
        this.branch = bank.getBranch();
        this.create_account = bank.getCreate_account();
        this.update_account = bank.getUpdate_account();
        this.customerCare = bank.getCustomerCare();
        this.interestRate = bank.getInterestRate();
    }
}
