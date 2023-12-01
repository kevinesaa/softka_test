package com.corp.esaa.bankAcc.cashFlow.controllers;

import com.corp.esaa.bankAcc._commons.entities.responseApi.CommonResponseBodyDTO;
import com.corp.esaa.bankAcc.cashFlow.enteties.requestApi.CashFlowRequestDTO;
import com.corp.esaa.bankAcc.cashFlow.enteties.requestApi.CashFlowResponseDTO;
import com.corp.esaa.bankAcc.cashFlow.services.ICashFlowService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class CashFlowController {

    //@Autowired
    private final ICashFlowService cashFlowService;

    public CashFlowController(ICashFlowService cashFlowService) {
        this.cashFlowService = cashFlowService;
    }

    @PostMapping("/headquader-transaction")
    public ResponseEntity<CommonResponseBodyDTO<CashFlowResponseDTO>> HeadquaterTransaction(@Valid final CashFlowRequestDTO request) {

        final CashFlowResponseDTO responseDTO = this.cashFlowService.headQuaterTransation(request);
        final CommonResponseBodyDTO<CashFlowResponseDTO> response = new CommonResponseBodyDTO();
        response.setStatusCode(0);
        response.setData(responseDTO);
        return ResponseEntity.ok(response);
    }


}
