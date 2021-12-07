package com.example.webshop.service;

import com.example.webshop.model.Product;
import com.example.webshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public List<Product> showProducts() {
        return productRepository.findAll();
    }

    public List<Product> showProductsByCategory(int category) {
        return productRepository.findByCategory(category);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
