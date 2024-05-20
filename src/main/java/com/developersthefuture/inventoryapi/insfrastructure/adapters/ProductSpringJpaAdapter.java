package com.developersthefuture.inventoryapi.insfrastructure.adapters;

import com.developersthefuture.inventoryapi.domain.model.Product;
import com.developersthefuture.inventoryapi.domain.model.constant.enums.ErrorResponseEnum;
import com.developersthefuture.inventoryapi.domain.port.ProductPersistencePort;
import com.developersthefuture.inventoryapi.insfrastructure.exception.ProductException;
import com.developersthefuture.inventoryapi.insfrastructure.mappers.ProductDboMapper;
import com.developersthefuture.inventoryapi.insfrastructure.repositories.IJpaProductRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class ProductSpringJpaAdapter implements ProductPersistencePort {
    private final IJpaProductRepository jpaProductRepository;
    private final ProductDboMapper productDboMapper;

    @Override
    public Product getById(Long id) {
        var optionalProduct= jpaProductRepository.findById(id);
        if (optionalProduct.isEmpty()){
            throw new ProductException(ErrorResponseEnum.CC0001.getCode(),String.format(ErrorResponseEnum.CC0001.getMessage(),id));
        }
        return productDboMapper.toDomain(optionalProduct.get());
    }
}
