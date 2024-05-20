package com.developersthefuture.inventoryapi.insfrastructure.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductException extends RuntimeException{
    private String code;
    private String message;

    public ProductException(String code, String message) {
        this.code = code;
        this.message=message;
    }

}
