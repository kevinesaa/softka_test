package com.corp.esaa.bankAcc.cashFlow.repositories;


import com.corp.esaa.bankAcc._commons.entities.database.BankAcc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

@DataMongoTest
class CashFlowRepositoryTest {

    @Autowired
    private ICashFlowRepository repository;

    @Test
    public void whenCountRetunIT() {
        Long a = repository.count();
        Assertions.assertNotNull(a);
    }

    @Test
    public void whenRequestBalanceReturnIt() {
        //BankAcc balance = repository.getBalance();
        //Assertions.assertNotNull(balance);
    }
}