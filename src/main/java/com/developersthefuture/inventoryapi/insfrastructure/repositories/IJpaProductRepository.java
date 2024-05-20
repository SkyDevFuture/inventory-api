package com.developersthefuture.inventoryapi.insfrastructure.repositories;

import com.developersthefuture.inventoryapi.insfrastructure.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJpaProductRepository extends JpaRepository<ProductEntity, Long> {

    List<ProductEntity> findByCodeContaining(String codeProduct);

    List<ProductEntity> findByNameContaining(String name);

}
