package com.corp.esaa.bankAcc._commons.entities.helpers;

import com.corp.esaa.bankAcc._commons.entities.database.BankAcc;

import java.util.HashMap;
import java.util.Map;

public class BackAccWrapper {


    private Map<Integer, BankAcc> bankAccs = new HashMap<>();
    private static BackAccWrapper instance;

    private BackAccWrapper() {}

    public static BackAccWrapper getInstance() {
        if(instance == null) {
            instance = new BackAccWrapper();
        }
        return instance;
    }

    public BankAcc getBankAcc(Integer id) {
        return bankAccs.get(id);
    }
}
