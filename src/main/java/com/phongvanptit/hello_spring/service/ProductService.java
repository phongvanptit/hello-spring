package com.phongvanptit.hello_spring.service;

import com.phongvanptit.hello_spring.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    Product getById(Long id);

    Product create(Product product);

    Product update(Long id, Product product);

    void delete(Long id);
}
