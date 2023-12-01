package com.corp.esaa.bankAcc._commons.entities.database;

import java.math.BigDecimal;

public enum TransactionType {

    HEADQUATER_TRANSACTION(1,"0"),
    ;

    private final Integer id;
    private final BigDecimal feet;

    TransactionType(Integer id, String feet) {
        this.id = id;
        this.feet = new BigDecimal(feet);
    }
}
