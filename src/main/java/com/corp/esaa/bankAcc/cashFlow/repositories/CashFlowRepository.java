package com.corp.esaa.bankAcc.cashFlow.repositories;

import com.corp.esaa.bankAcc._commons.entities.database.CashFlow;
import com.corp.esaa.bankAcc._commons.entities.helpers.CashFlowWrapper;

import java.util.Map;


public class CashFlowRepository  {

    private CashFlowWrapper cashFlowWrapper;

    private void initHelper() {
        if(this.cashFlowWrapper == null) {
            this.cashFlowWrapper = CashFlowWrapper.getInstance();
        }
    }

    //@Override
    public CashFlow saveCashFlow(CashFlow cashFlow) {
        final Map<Integer, CashFlow> cashFlowList = this.cashFlowWrapper.getCashFlowList();
        int newId = cashFlowList.size() + 1;
        cashFlow.setId(Integer.toString(newId));
        cashFlowList.put(newId,cashFlow);
        return cashFlow;
    }
}
