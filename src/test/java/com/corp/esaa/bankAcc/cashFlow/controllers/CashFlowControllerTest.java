package com.corp.esaa.bankAcc.cashFlow.controllers;


import com.corp.esaa.bankAcc.cashFlow.services.ICashFlowService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.client.MockRestServiceServer;


//@RestClientTest(CashFlowController.class)
@ExtendWith(MockitoExtension.class)
@SpringBootTest
class CashFlowControllerTest {


    private ICashFlowService service;

    private CashFlowController controller;

    @BeforeEach
    public  void setup(){
        service = Mockito.mock(ICashFlowService.class);
        controller = new CashFlowController(service);
    }

/*
    @Autowired
    private MockRestServiceServer serverMock;



*/
    @Test
    public void whenNewHeadquaterTransactionThenReturnTransactionWithId() {
        System.out.println("Test");

        Assertions.assertEquals(0,0);
    }


}