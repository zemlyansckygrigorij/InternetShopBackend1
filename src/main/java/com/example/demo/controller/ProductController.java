package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import javax.validation.Valid;


@CrossOrigin
@Configuration
@RestController
@RequestMapping("/")
public class ProductController{
    /**
     *
     */
//    @Autowired
//    ProductService productService;
//     @Autowired
//    private AuthenticationManager authenticationManager;
    @Autowired
    private ProductRepository productRepo;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Product>> getProducts() {
            return new ResponseEntity<Collection<Product>>(productRepo.findAll(), HttpStatus.OK);
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public ResponseEntity<List<Product>> getProducts(){
//        List<Product> productList=productService.productList();
//        return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
//    }

}

