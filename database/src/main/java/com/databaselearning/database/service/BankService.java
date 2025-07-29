package com.databaselearning.database.service;

import com.databaselearning.database.dto.BankDto;
import com.databaselearning.database.mapper.BankMapper;
import com.databaselearning.database.model.Bank;
import com.databaselearning.database.repository.BankRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service
public class BankService {
    private static final Logger logger = LoggerFactory.getLogger(BankService.class);

    @Autowired
    private BankRepository bankRepository;
    @Autowired
    private BankMapper bankMapper;

    public Bank createBank(Bank bank){

        logger.info("Creating bank: {}", bank);
        bankRepository.save(bank);
        logger.info("Created student: {}", bank);
        return bank;
    }

    public BankDto createBankById(String bankId) {
        logger.info("fetching bank ById {}", bankId);
         Bank bank= bankRepository.getReferenceById(Long.valueOf(bankId));
        logger.info("fetched bank ById {} student details {}", bankId,bank);
        BankDto bankDtos= bankMapper.toDto(bank);
        return bankDtos;

    }

    public List<BankDto> getAllBank() {
        logger.info("fetched all the bank details ");
       List<Bank> bank= bankRepository.findAll();
        List<BankDto> bankDtos= bankMapper.toDtoList(bank);
        return bankDtos;

    }

}



