package com.developersthefuture.inventoryapi.domain.model.constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorResponseEnum {
    CC0001("CC0001","No se encontro un producto con el id %s");
    private final String code;
    private final String message;
}
