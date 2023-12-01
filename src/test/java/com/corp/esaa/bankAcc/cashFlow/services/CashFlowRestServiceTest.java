package com.corp.esaa.bankAcc.cashFlow.services;

import com.corp.esaa.bankAcc._commons.entities.database.CashFlow;
import com.corp.esaa.bankAcc.cashFlow.enteties.requestApi.CashFlowRequestDTO;
import com.corp.esaa.bankAcc.cashFlow.enteties.requestApi.CashFlowResponseDTO;
import com.corp.esaa.bankAcc.cashFlow.mapper.ICashFlowMapper;
import com.corp.esaa.bankAcc.cashFlow.repositories.ICashFlowRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;


@ExtendWith(MockitoExtension.class)
class CashFlowRestServiceTest {

    @Mock
    private ICashFlowRepository repository;

    @Mock
    private ICashFlowMapper mapper;

    @InjectMocks
    private CashFlowRestService service;

    @Test
    public void whenSaveDtoReturnWithId() {
        //arrange
        CashFlowRequestDTO requestModel = new CashFlowRequestDTO();
        requestModel.setAmount(new BigDecimal("100.00"));
        requestModel.setDestinyAccountId(1);
        requestModel.setSourceAccountId(2);

        CashFlowResponseDTO responseMockDTO = new CashFlowResponseDTO();
        responseMockDTO.setId("1");

        CashFlow databaseModelWithoutId = new CashFlow();
        databaseModelWithoutId.setAmount(new BigDecimal("100.00"));

        CashFlow databaseModelSaveId = new CashFlow();
        databaseModelSaveId.setId("1");
        databaseModelSaveId.setAmount(new BigDecimal("100.00"));



        Mockito.when(
                repository.save(databaseModelWithoutId)
        ).thenReturn(databaseModelSaveId);

        Mockito.when(
                mapper.toDatabaseModel(requestModel)
        ).thenReturn(databaseModelWithoutId);

        Mockito.when(
                mapper.toResponseDTO(databaseModelSaveId)
        ).thenReturn(responseMockDTO);

        //apply
        CashFlowResponseDTO responseDTO = service.headQuaterTransation(requestModel);

        //asserts
        Assertions.assertEquals("1", responseDTO.getId());
    }
}