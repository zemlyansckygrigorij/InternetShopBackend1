package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.repository.CrudRepository;
import java.util.Collection;

public interface ProductRepository extends CrudRepository<Product, Integer>{
    Collection<Product> findAll();
}
