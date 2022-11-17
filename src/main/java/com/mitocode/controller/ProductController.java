package com.mitocode.controller;

import com.mitocode.model.Product;
import com.mitocode.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService; // = new ProductService();

    @GetMapping
    public Product getProductInfoREST(){
        Product product = new Product(1 , "TV");
        productService.getProductInfo(product);
        return product;
    }
}
