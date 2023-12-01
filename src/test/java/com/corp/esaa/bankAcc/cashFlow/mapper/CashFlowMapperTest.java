package com.corp.esaa.bankAcc.cashFlow.mapper;


import com.corp.esaa.bankAcc._commons.entities.database.CashFlow;
import com.corp.esaa.bankAcc.cashFlow.enteties.requestApi.CashFlowRequestDTO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.math.BigDecimal;


@ExtendWith(MockitoExtension.class)
class CashFlowMapperTest {


    private ICashFlowMapper mapper;

    @BeforeEach
    public void setup() {
        mapper = new CashFlowMapper();
    }

    @AfterEach
    public void tearDown() {
        mapper = null;
    }


    @Test
    public void whenRequestModelReturnDbModel()
    {
        //arrange
        CashFlowRequestDTO input = new CashFlowRequestDTO();
        input.setSourceAccountId(1);
        input.setDestinyAccountId(2);
        input.setAmount(new BigDecimal("100.00"));

        //apply
        CashFlow databaseModel = mapper.toDatabaseModel(input);

        //assert
        Assertions.assertNotNull(databaseModel);
        Assertions.assertNotNull(databaseModel.getDestinyBankAcc());
        Assertions.assertNotNull(databaseModel.getSourceBankAcc());
        Assertions.assertEquals(new BigDecimal("100.00"), databaseModel.getAmount());
        Assertions.assertEquals(1,databaseModel.getSourceBankAcc().getId());
        Assertions.assertEquals(2,databaseModel.getDestinyBankAcc().getId());
    }
}