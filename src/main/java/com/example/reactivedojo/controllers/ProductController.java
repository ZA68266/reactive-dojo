package com.example.reactivedojo.controllers;

import com.example.reactivedojo.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/{id}")
    private Mono<Product> getProductById(@PathVariable String id) {
        return Mono.just(new Product("whatever"));
    }
}
