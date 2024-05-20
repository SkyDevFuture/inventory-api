package com.developersthefuture.inventoryapi.application.service;

import com.developersthefuture.inventoryapi.application.mappers.ProductDtoMapper;
import com.developersthefuture.inventoryapi.application.usecases.ProductService;
import com.developersthefuture.inventoryapi.domain.model.dto.ProductDto;
import com.developersthefuture.inventoryapi.domain.port.ProductPersistencePort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductManagementService implements ProductService {

    private final ProductPersistencePort productPersistencePort;
    private final ProductDtoMapper productDtoMapper;

    @Override
    public ProductDto findById(Long id) {
        var product= productPersistencePort.getById(id);
        return productDtoMapper.toDto(product);
    }
}
