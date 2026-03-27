package com.phongvanptit.hello_spring.service.impl;

import com.phongvanptit.hello_spring.model.Product;
import com.phongvanptit.hello_spring.repository.ProductRepository;
import com.phongvanptit.hello_spring.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class  ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository repository) {
        this.productRepository = repository;
    }


    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product không tồn tại với id:" + id));
    }

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Long id, Product product) {
        Product existing = getById(id);
        existing.setName((product.getName()));
        existing.setPrice(product.getPrice());
        return productRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
