package com.corp.esaa.bankAcc.cashFlow.services;


import com.corp.esaa.bankAcc._commons.entities.database.CashFlow;
import com.corp.esaa.bankAcc.cashFlow.mapper.ICashFlowMapper;
import com.corp.esaa.bankAcc.cashFlow.enteties.requestApi.CashFlowRequestDTO;
import com.corp.esaa.bankAcc.cashFlow.enteties.requestApi.CashFlowResponseDTO;
import com.corp.esaa.bankAcc.cashFlow.repositories.ICashFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CashFlowRestService implements ICashFlowService{

    @Autowired
    private ICashFlowMapper cashFlowMapper;
    @Autowired
    private ICashFlowRepository cashFlowRepository;

    @Override
    public CashFlowResponseDTO headQuaterTransation(CashFlowRequestDTO requestModel) {

        final CashFlow databaseModel = cashFlowMapper.toDatabaseModel(requestModel);
        final CashFlow dbObject = cashFlowRepository.save(databaseModel);
        return cashFlowMapper.toResponseDTO(dbObject);
    }
}
