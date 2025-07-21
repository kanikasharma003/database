package com.databaselearning.database.service;

import com.databaselearning.database.model.Bank;
import com.databaselearning.database.repository.BankRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class BankService {
    private static final Logger logger = LoggerFactory.getLogger(BankService.class);

    @Autowired
    private BankRepository bankRepository;

    public Bank createBank(Bank bank){

        logger.info("Creating bank: {}", bank);
        bankRepository.save(bank);
        logger.info("Created student: {}", bank);
        return bank;
    }

    public Bank createBankById(String bankId) {
        logger.info("fetching bank ById {}", bankId);
         Bank bank= bankRepository.getReferenceById(Long.valueOf(bankId));
        logger.info("fetched bank ById {} student details {}", bankId,bank);
        return bank;

    }
}
