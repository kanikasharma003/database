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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getCreate_account() {
        return create_account;
    }

    public void setCreate_account(int create_account) {
        this.create_account = create_account;
    }

    public int getUpdate_account() {
        return update_account;
    }

    public void setUpdate_account(int update_account) {
        this.update_account = update_account;
    }

    public int getCustomerCare() {
        return customerCare;
    }

    public void setCustomerCare(int customerCare) {
        this.customerCare = customerCare;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
