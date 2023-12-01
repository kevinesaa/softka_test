package com.corp.esaa.bankAcc._commons.entities.database;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.math.BigDecimal;

//@Entity
//@Table(name = "cash_flow")
@Document(collection = "movements")
public class CashFlow implements Serializable {

    @Id
    private String id;

    private BigDecimal amount;
    private BigDecimal feet;
    private BigDecimal completeAmount;

    //private TransactionType transactionType;

    private BankAcc sourceBankAcc;
    private BankAcc destinyBankAcc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFeet() {
        return feet;
    }

    public void setFeet(BigDecimal feet) {
        this.feet = feet;
    }

    public BigDecimal getCompleteAmount() {
        return completeAmount;
    }

    public void setCompleteAmount(BigDecimal completeAmount) {
        this.completeAmount = completeAmount;
    }

    public BankAcc getSourceBankAcc() {
        return sourceBankAcc;
    }

    public void setSourceBankAcc(BankAcc sourceBankAcc) {
        this.sourceBankAcc = sourceBankAcc;
    }

    public BankAcc getDestinyBankAcc() {
        return destinyBankAcc;
    }

    public void setDestinyBankAcc(BankAcc destinyBankAcc) {
        this.destinyBankAcc = destinyBankAcc;
    }
}
