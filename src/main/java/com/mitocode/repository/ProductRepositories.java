package com.mitocode.repository;

import com.mitocode.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositories {

    public void getProduct(Product product){
        System.out.println("The product is: " + product);
    }
}
