package com.corp.esaa.bankAcc.banks.respositories;

import com.corp.esaa.bankAcc._commons.entities.database.BankAcc;
import com.corp.esaa.bankAcc._commons.entities.helpers.BackAccWrapper;



public class BankAccRepository  {

    private BackAccWrapper backAccWrapper;

    private void initHelper() {
        if(this.backAccWrapper == null) {
            this.backAccWrapper = BackAccWrapper.getInstance();
        }

    }

   // @Override
    public BankAcc getAccountById(Integer accountId) {
        initHelper();
        return this.backAccWrapper.getBankAcc(accountId);
    }
}
