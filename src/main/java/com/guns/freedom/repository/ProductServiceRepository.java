package com.guns.freedom.repository;

import com.guns.freedom.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductServiceRepository extends CrudRepository<Product, Integer> {
}
