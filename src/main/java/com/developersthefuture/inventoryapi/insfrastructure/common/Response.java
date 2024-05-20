package com.developersthefuture.inventoryapi.insfrastructure.common;

import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public class Response<T> {

    /**
     * Data to response
     */
    private T bodyOut;

    /**
     * Message to response
     */
    private String message;

    /**
     * Code to response
     */
    private Integer code;
}
