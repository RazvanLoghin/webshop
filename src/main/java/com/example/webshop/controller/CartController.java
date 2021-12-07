//package com.example.webshop.controller;
//
//import com.example.webshop.model.Product;
//import com.example.webshop.service.CartService;
//import com.example.webshop.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController("cart")
//public class CartController {
//
//    @Autowired
//    CartService cartService;
//
//    @GetMapping()
//    public List<Product> getProducts() {
//        return cartService.showProductsInCart();
//    }
//
//    @PostMapping()
//    public void addProduct(@RequestBody Product product) {
//        cartService.addProduct(product);
//        System.out.println("Product " + product.getName() + " added in the cart");
//    }
//}
