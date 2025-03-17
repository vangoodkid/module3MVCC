package com.example.ss12.service;

import com.example.ss12.model.Product;
import java.util.List;

public interface IProductService {
    List<Product> findAll();
    boolean add(Product product);
    boolean deleteById(int id);
    List<Product> searchByName(String name);
    Product findById(int id);
    boolean update(Product product);
}
