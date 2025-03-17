package com.example.ss12.service;

import com.example.ss12.model.Product;
import com.example.ss12.repository.IProductRepository;
import com.example.ss12.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public boolean add(Product product) {
        return productRepository.add(product);
    }

    @Override
    public boolean deleteById(int id) {
        return productRepository.deleteById(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productRepository.searchByName(name);
    }

    // Thêm phương thức findById
    @Override
    public Product findById(int id) {
        return productRepository.findById(id); // Gọi phương thức trong Repository
    }

    @Override
    public boolean update(Product product) {
        return productRepository.update(product);
    }
}
