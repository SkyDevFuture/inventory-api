package com.developersthefuture.inventoryapi.application.mappers;

import com.developersthefuture.inventoryapi.domain.model.Product;
import com.developersthefuture.inventoryapi.domain.model.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductDtoMapper {
    @Mapping(source="id", target="id")
    @Mapping(source="code", target="code")
    @Mapping(source = "name", target = "name")
    @Mapping(source="unitPrice", target="unitPrice")
    @Mapping(source = "stock", target = "stock")
    @Mapping(source="image", target="image")
    @Mapping(source="idCatalog", target="idCatalog")
    @Mapping(source = "isActive", target = "isActive")
    @Mapping(source="updatedAt", target="updatedAt")
    @Mapping(source = "creatorUserId", target = "creatorUserId")
    @Mapping(source = "updaterUserId", target = "updaterUserId")
    ProductDto toDto(Product domain);

}
