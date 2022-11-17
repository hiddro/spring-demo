package com.mitocode.service;

import com.mitocode.model.Product;
import com.mitocode.repository.ProductRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepositories productRepositories; // = new ProductRepositories();

    public void getProductInfo(Product product){
        productRepositories.getProduct(product);
    }
}
