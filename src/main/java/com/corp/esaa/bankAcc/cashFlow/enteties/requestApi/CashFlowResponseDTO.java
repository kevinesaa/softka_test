package com.corp.esaa.bankAcc.cashFlow.enteties.requestApi;


import java.math.BigDecimal;

public class CashFlowResponseDTO {

    private String id;
    private Integer sourceAccountId;
    private Integer destinyAccountId;
    private BigDecimal amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSourceAccountId() {
        return sourceAccountId;
    }

    public void setSourceAccountId(Integer sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    public Integer getDestinyAccountId() {
        return destinyAccountId;
    }

    public void setDestinyAccountId(Integer destinyAccountId) {
        this.destinyAccountId = destinyAccountId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}
