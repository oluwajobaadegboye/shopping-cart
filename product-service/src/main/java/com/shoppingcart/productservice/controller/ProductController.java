package com.shoppingcart.productservice.controller;

import com.shoppingcart.productservice.dto.ProductDto;
import com.shoppingcart.productservice.model.Product;
import com.shoppingcart.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product createProduct(ProductDto productDto) {
        Product product = toProduct(productDto);
        return service.createProduct(product);
    }

    private Product toProduct(@RequestBody ProductDto productDto) {
        Product product = new Product(productDto.getProductName(),productDto.getDescription(),productDto.getPrice(),
                productDto.getImageUrl(),productDto.getQuantity());
        product.setUserId(productDto.getUserId());
        return product;
    }

    @GetMapping
    public Iterable<Product> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable long id) {
        return service.findById(id);
    }

}
