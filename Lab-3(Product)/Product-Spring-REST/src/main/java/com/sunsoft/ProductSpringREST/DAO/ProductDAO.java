package com.sunsoft.ProductSpringREST.DAO;

import java.util.List;

import com.sunsoft.ProductSpringREST.Entity.Product;

public interface ProductDAO {
	
	public void save(Product p);
    public Product findById(Integer productId);
    public List<Product> findAll();

}
