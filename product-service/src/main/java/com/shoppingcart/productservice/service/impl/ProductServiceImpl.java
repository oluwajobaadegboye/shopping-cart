package com.shoppingcart.productservice.service.impl;

import com.shoppingcart.productservice.model.Product;
import com.shoppingcart.productservice.repository.ProductRepository;
import com.shoppingcart.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository repository;

    @Override
    public Product createProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Iterable<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product findById(long id) {
        return repository.findById(id).get();
    }
}