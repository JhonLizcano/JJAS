package com.nisum.hackaton.repository;

import com.nisum.hackaton.model.Commerce;
import com.nisum.hackaton.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {

    Product save(Product product);

    Optional<Product> findBySku(String sku);
}
