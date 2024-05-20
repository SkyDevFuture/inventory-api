package com.developersthefuture.inventoryapi.application.usecases;

import com.developersthefuture.inventoryapi.domain.model.dto.ProductDto;

public interface ProductService {
    ProductDto findById(Long id);
}
