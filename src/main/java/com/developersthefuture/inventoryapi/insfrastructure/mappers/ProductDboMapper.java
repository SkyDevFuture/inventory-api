package com.developersthefuture.inventoryapi.insfrastructure.mappers;

import com.developersthefuture.inventoryapi.domain.model.Product;
import com.developersthefuture.inventoryapi.insfrastructure.entities.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductDboMapper {
    @Mapping(source="id", target="id")
    @Mapping(source="code", target="code")
    @Mapping(source = "name", target = "name")
    @Mapping(source="unitPrice", target="unitPrice")
    @Mapping(source = "stock", target = "stock")
    @Mapping(source="image", target="image")
    @Mapping(source="idCatalog", target="idCatalog")
    @Mapping(source = "isActive", target = "isActive")
    @Mapping(source="updatedAt", target="updatedAt")
    @Mapping(source="createdAt", target="createdAt")
    @Mapping(source = "creatorUserId", target = "creatorUserId")
    @Mapping(source = "updaterUserId", target = "updaterUserId")
    Product toDomain(ProductEntity model);
    @InheritInverseConfiguration
    ProductEntity toEntity(Product entity);
}
