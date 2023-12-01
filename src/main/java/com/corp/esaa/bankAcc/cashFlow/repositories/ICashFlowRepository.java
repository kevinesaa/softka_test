package com.corp.esaa.bankAcc.cashFlow.repositories;

import com.corp.esaa.bankAcc._commons.entities.database.BankAcc;
import com.corp.esaa.bankAcc._commons.entities.database.CashFlow;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface ICashFlowRepository extends MongoRepository<CashFlow,Integer> {
/*
    @Aggregation(pipeline = {
            "{$group:{'bankAcc': {id:2,balance:sum}}}",

    })

    BankAcc getBalance(); */
}
