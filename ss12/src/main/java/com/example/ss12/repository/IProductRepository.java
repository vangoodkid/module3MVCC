package com.example.ss12.repository;

import com.example.ss12.model.Product;
import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    boolean add(Product product);
    List<Product> searchByName(String name);
    boolean deleteById(int id);
    boolean update(Product product);
    Product findById(int id);
}