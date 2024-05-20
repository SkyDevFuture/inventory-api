package com.developersthefuture.inventoryapi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Long id;

    private String code;

    private String name;

    private Double unitPrice;

    private Integer stock;

    private String image;

    private Long idCatalog;

    private Boolean isActive;

    private Date updatedAt;

    private Date createdAt;

    private String creatorUserId;

    private String updaterUserId;

}
