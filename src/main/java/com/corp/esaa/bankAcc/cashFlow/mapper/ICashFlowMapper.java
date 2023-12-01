package com.corp.esaa.bankAcc.cashFlow.mapper;

import com.corp.esaa.bankAcc._commons.entities.database.CashFlow;
import com.corp.esaa.bankAcc.cashFlow.enteties.requestApi.CashFlowRequestDTO;
import com.corp.esaa.bankAcc.cashFlow.enteties.requestApi.CashFlowResponseDTO;

public interface ICashFlowMapper {
    CashFlowResponseDTO toResponseDTO(final CashFlow dbModel);
    CashFlow toDatabaseModel(final CashFlowRequestDTO input);
}
