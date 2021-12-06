package com.example.webshop;

import com.example.webshop.model.Product;
import com.example.webshop.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class ProductRepositoryTest {

    @Autowired
    ProductRepository repo;

    @Test
    public void addProduct() {
        Product product = new Product();
        product.setName("Product A");
        product.setCategory(1);
        product.setDescription("This is the best product");
        product.setId(1L);

        repo.save(product);
    }
}
