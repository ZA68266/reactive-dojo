package com.example.reactivedojo.controllers;

import com.example.reactivedojo.models.Product;
import com.example.reactivedojo.repository.ProductReactiveRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductReactiveRepository productReactiveRepository;

    public ProductController(ProductReactiveRepository productReactiveRepository) {
        this.productReactiveRepository = productReactiveRepository;
    }

    @GetMapping("/{id}")
    private Mono<Product> getProductById(@PathVariable Integer id) {
        return productReactiveRepository.findById(id);
    }
}
