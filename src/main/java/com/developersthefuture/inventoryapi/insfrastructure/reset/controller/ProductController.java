package com.developersthefuture.inventoryapi.insfrastructure.reset.controller;


import com.developersthefuture.inventoryapi.application.usecases.ProductService;
import com.developersthefuture.inventoryapi.domain.model.dto.ProductDto;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("{id}")
    public ResponseEntity<ProductDto> getByIdProduct(@PathVariable Long id) {
        logger.info("Init findAllProducts");
        return new ResponseEntity<>(this.productService.findById(id), HttpStatus.OK);
    }
}
