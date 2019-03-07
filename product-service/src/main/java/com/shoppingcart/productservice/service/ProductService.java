package com.shoppingcart.productservice.service;

import com.shoppingcart.productservice.model.Product;


public interface ProductService {
    public Product createProduct(Product product);
    public Iterable<Product> findAll();
    public Product findById(long id);
}
