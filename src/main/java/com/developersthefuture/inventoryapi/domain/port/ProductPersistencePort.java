package com.developersthefuture.inventoryapi.domain.port;

import com.developersthefuture.inventoryapi.domain.model.Product;

public interface ProductPersistencePort {
    Product getById(Long id);
}
