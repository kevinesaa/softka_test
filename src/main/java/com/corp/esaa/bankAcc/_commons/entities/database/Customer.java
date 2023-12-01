package com.corp.esaa.bankAcc._commons.entities.database;

import java.io.Serializable;

//@Entity
//@Table(name = "customers")
public class Customer implements Serializable {

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    //@OneToOne(mappedBy = "customer")
    private BankAcc bankAccount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BankAcc getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAcc bankAccount) {
        this.bankAccount = bankAccount;
    }
}
