package com.corp.esaa.bankAcc.cashFlow.enteties.requestApi;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;


public class CashFlowRequestDTO {

    @NotNull
    @Min(1)
    private Integer sourceAccountId;

    @NotNull
    @Min(1)
    private Integer destinyAccountId;

    @NotNull
    private BigDecimal amount;

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
