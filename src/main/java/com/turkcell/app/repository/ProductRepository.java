package com.turkcell.app.repository;

import com.turkcell.app.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements BaseRepository<Product>
{
    List<Product> products = new ArrayList<Product>();

    @Override
    public List<Product> findAll() {
        return List.of();
    }
    @Override
    public Product findById(int id) {
        return null;
    }
    @Override
    public void save(Product user) {

    }
    @Override
    public void delete(Product product) {

    }
}
