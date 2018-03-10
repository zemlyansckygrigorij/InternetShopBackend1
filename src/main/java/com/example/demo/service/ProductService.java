package com.example.demo.service;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {
    @Autowired
    ProductRepository repository;
//    public Product getProducts(){
//        return repository.findAll();
//
//    }
    public void  saveProduct(Product product){
        repository.save(product);

    }

    public List<Product> productList (){
        return (List<Product>) repository.findAll();
    }

//    public Product deleteProduct(int id){
//        Product product = repository.findOne(id);
//        if(product != null){
//            repository.delete(id);
//        }
//        return product;
//
//    }

//    public Product getProductbyId(int id){
//        return repository.findOne(id);
//    }

    public Product updateProduct(Product product){
        return repository.save(product);
    }

}
