package com.guns.freedom.service;

import com.guns.freedom.interfaces.IProductService;
import com.guns.freedom.model.Product;
import com.guns.freedom.repository.ProductServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("productService")
public class ProductService implements IProductService {

    @Autowired
    ProductServiceRepository repository;

    @Override
    public String create(Product product) {
        repository.save(product);
        return "\nreceived... " + product.getName() + "\n";
    }

}
