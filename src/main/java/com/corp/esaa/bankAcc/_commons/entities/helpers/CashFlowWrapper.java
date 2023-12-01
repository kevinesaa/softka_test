package com.corp.esaa.bankAcc._commons.entities.helpers;

import com.corp.esaa.bankAcc._commons.entities.database.CashFlow;

import java.util.HashMap;
import java.util.Map;

public class CashFlowWrapper {

    private Map<Integer,CashFlow> cashFlowList = new HashMap<>();
    private static CashFlowWrapper instance;

    private CashFlowWrapper() {}

    public static CashFlowWrapper getInstance() {
        if(instance == null) {
            instance = new CashFlowWrapper();
        }
        return instance;
    }

    public Map<Integer, CashFlow> getCashFlowList() {
        return cashFlowList;
    }
}
