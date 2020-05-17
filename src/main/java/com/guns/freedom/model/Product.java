package com.guns.freedom.model;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Product")
@Getter
@Setter
public class Product {

    public Product(String name) {
        this.name = name;
    }

    public Product() {

    }

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private int id;

    @Getter
    private String name;
}
