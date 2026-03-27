package com.phongvanptit.hello_spring.repository;

import com.phongvanptit.hello_spring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> id(Long id);
}
