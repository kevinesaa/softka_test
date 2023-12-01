package com.corp.esaa.bankAcc.banks.respositories;

import com.corp.esaa.bankAcc._commons.entities.database.BankAcc;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface IBankAccRepository  extends MongoRepository<BankAcc,Integer> {


}
