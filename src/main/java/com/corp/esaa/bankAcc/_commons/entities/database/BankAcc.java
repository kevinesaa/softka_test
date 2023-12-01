package com.corp.esaa.bankAcc._commons.entities.database;

import java.io.Serializable;
import java.math.BigDecimal;

//@Entity
//@Table(name = "bank_accounts")
public class BankAcc implements Serializable {

    //@Id
    private Integer id;
    private BigDecimal balance;

    //@OneToMany(mappedBy="bankAcc",fetch = FetchType.LAZY)
    //private List<CashFlow> movents;

    //@OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "customer_id", referencedColumnName = "id")
    //private Customer customer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }


}
