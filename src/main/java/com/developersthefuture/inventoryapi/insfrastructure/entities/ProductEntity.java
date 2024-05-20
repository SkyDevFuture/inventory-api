package com.developersthefuture.inventoryapi.insfrastructure.entities;

import com.developersthefuture.inventoryapi.insfrastructure.common.AbstractBaseAuditable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
public class ProductEntity extends AbstractBaseAuditable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code", columnDefinition = "varchar(100)", nullable = false)
    private String code;

    @Column(name = "name", columnDefinition = "varchar(100)", nullable = false)
    private String name;

    @Column(name = "id_catalog", nullable = false)
    private Long idCatalog;
    @Column(name = "unit_price")
    private Double unitPrice;
    private Integer stock;
    @Column(name = "image")
    private String image;
}
