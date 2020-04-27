package com.sunsoft.ProductSpringREST.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.sunsoft.ProductSpringREST.Entity.Product;
import com.sunsoft.ProductSpringREST.service.ProductService;



public class ProductController {
	
@Autowired private ProductService service;
    
    @GetMapping(path="/insert")
    public String createSample() {
        Product p1 = new Product(101,"Thumbs Up","Aaj kuch Toofani karte hai",40);
        Product p2 = new Product(102,"Mirinda","PagalPanti bhi Zaroori hai",35);
        Product p3 = new Product(103,"Mountain Dew","Darr ke aage Jeet hai",40);
        service.create(p1);
        service.create(p2);
        service.create(p3);
        return "Three products exits!";
    }
    
    @GetMapping("/rest/products")
    public List<Product> getAll(){
        return service.getAll();
    }

}
