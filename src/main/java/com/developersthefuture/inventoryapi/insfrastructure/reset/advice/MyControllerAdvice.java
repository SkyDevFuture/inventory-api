package com.developersthefuture.inventoryapi.insfrastructure.reset.advice;


import com.developersthefuture.inventoryapi.insfrastructure.common.ErrorResponse;
import com.developersthefuture.inventoryapi.insfrastructure.exception.ProductException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyControllerAdvice {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    @ExceptionHandler(ProductException.class)
    public ErrorResponse handleEmptyInput(ProductException exception) {
        return ErrorResponse.builder()
                .code(exception.getCode())
                .message(exception.getMessage())
                .build();
    }
}
