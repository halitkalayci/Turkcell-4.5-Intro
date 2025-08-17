package com.turkcell.app.repository;


import com.turkcell.app.entity.Product;

import java.util.List;

public interface BaseProductRepository {
    List<Product> findAll();
    Product findById(int id);
    void save(Product user);
}
