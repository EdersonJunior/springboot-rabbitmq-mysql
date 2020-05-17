package com.guns.freedom.rabbitmq;

import java.util.concurrent.CountDownLatch;

import com.guns.freedom.interfaces.IProductService;
import com.guns.freedom.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ProductReceiver {

    @Autowired
    @Qualifier("productService")
    private IProductService productService;

    public void receiveMessage(String message) {
        System.out.println("\nCreating " + message);
        productService.create(new Product(message));
    }

}