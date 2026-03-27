package com.phongvanptit.hello_spring.controller;

import com.phongvanptit.hello_spring.model.Product;
import com.phongvanptit.hello_spring.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController (ProductService service) {
        this.productService = service;
    }

    //GET /products
    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(productService.getAll())
;    }

    // GET /products/1
    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getById(id));
    }

    //POST /products
    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {
        return ResponseEntity.status(201).body((productService.create(product)));
}

    // PUT /products/1
    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id, @RequestBody Product product) {
        return ResponseEntity.ok(productService.update(id, product));
    }

    //DELETE /products/id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
