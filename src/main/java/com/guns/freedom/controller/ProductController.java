package com.guns.freedom.controller;

import com.guns.freedom.interfaces.IProductSender;
import com.guns.freedom.interfaces.IProductService;
import com.guns.freedom.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Qualifier("productService")
    @Autowired
    IProductService productService;

    @Autowired
    IProductSender productSender;

    @PostMapping("/")
    public String create(@RequestBody Product product) throws Exception {
        System.out.println("\nReceived: " + product.getName());
        productSender.sendMessage(product.getName());
        return "ok";
    }
}
