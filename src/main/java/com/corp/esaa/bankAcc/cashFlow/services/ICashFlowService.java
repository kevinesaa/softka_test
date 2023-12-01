package com.corp.esaa.bankAcc.cashFlow.services;

import com.corp.esaa.bankAcc.cashFlow.enteties.requestApi.CashFlowRequestDTO;
import com.corp.esaa.bankAcc.cashFlow.enteties.requestApi.CashFlowResponseDTO;


public interface ICashFlowService {
    CashFlowResponseDTO headQuaterTransation(CashFlowRequestDTO request);
}
