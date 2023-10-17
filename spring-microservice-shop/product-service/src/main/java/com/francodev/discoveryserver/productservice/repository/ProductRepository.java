package com.francodev.discoveryserver.productservice.repository;

import com.francodev.discoveryserver.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
