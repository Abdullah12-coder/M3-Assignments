package com.sunsoft.ProductSpringREST.service;

import java.util.List;

import com.sunsoft.ProductSpringREST.Entity.Product;

public interface ProductService {
	
	Product find(int productId);
    List<Product> getAll();
    void create(Product p);

}
