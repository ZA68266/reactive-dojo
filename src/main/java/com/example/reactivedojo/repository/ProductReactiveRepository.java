package com.example.reactivedojo.repository;

import com.example.reactivedojo.models.Product;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReactiveRepository extends R2dbcRepository<Product, Integer> {
}
