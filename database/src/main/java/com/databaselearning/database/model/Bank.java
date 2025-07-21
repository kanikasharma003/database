package com.databaselearning.database.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String branch;
    private int create_account;
    private int update_account;
    private int customerCare;
    private double interestRate;




}
