package com.databaselearning.database.mapper;

import com.databaselearning.database.dto.BankDto;
import com.databaselearning.database.model.Bank;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "string")
public interface BankMapper {
     BankDto toDto(Bank bank);
     List<BankDto> toDtoList(List<Bank> bankList);

}
