package com.corp.esaa.bankAcc._platform.controllers;

import com.corp.esaa.bankAcc._commons.entities.responseApi.CommonResponseBodyDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice// ControllerAdvice
public class CommonHandlerException //extends ResponseEntityExceptionHandler
{

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<Object> testHandleException(MethodArgumentNotValidException ex, HttpServletRequest request) {

        final CommonResponseBodyDTO r = new CommonResponseBodyDTO();
        r.setStatusCode(-10);
        return new ResponseEntity<>(r, HttpStatus.BAD_REQUEST);

    }
}
