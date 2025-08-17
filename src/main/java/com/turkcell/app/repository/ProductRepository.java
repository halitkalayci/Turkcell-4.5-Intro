package com.turkcell.app.repository;

import com.turkcell.app.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements BaseProductRepository
{
    List<Product> products = new ArrayList<Product>();

    public List<Product> findAll() {
        return List.of();
    }

    public Product findById(int id) {
        return null;
    }

    public void save(Product user) {

    }
}
