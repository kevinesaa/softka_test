package com.corp.esaa.bankAcc.cashFlow.mapper;

import com.corp.esaa.bankAcc._commons.entities.database.BankAcc;
import com.corp.esaa.bankAcc._commons.entities.database.CashFlow;
import com.corp.esaa.bankAcc.cashFlow.enteties.requestApi.CashFlowRequestDTO;
import com.corp.esaa.bankAcc.cashFlow.enteties.requestApi.CashFlowResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class CashFlowMapper implements ICashFlowMapper{



    public CashFlow toDatabaseModel(final CashFlowRequestDTO input)
    {
        final CashFlow model = new CashFlow();
        final BankAcc sourceAccount = new BankAcc();
        final BankAcc destinyAccount = new BankAcc();
        sourceAccount.setId(input.getSourceAccountId());
        destinyAccount.setId(input.getDestinyAccountId());
        model.setSourceBankAcc(sourceAccount);
        model.setDestinyBankAcc(destinyAccount);
        model.setAmount(input.getAmount());
        return model;
    }

    public CashFlowResponseDTO toResponseDTO(final CashFlow dbModel) {

        final CashFlowResponseDTO response = new CashFlowResponseDTO();
        response.setId(dbModel.getId());
        response.setAmount(dbModel.getAmount());
        response.setDestinyAccountId(dbModel.getDestinyBankAcc().getId());
        response.setSourceAccountId(dbModel.getSourceBankAcc().getId());
        return response;
    }
}
