package com.example.webshop.controller;

import com.example.webshop.model.Product;
import com.example.webshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> showProducts() {
        return productService.showProducts();
    }

    @PostMapping()
    public String addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return "Product successfully added!";
    }

    @GetMapping("category/{category}")
    public List<Product> showProductsByCategory(@PathVariable int category) {
        return productService.showProductsByCategory(category);
    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

}
