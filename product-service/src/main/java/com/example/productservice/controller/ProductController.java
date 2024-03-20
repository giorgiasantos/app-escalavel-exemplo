package com.example.productservice.controller;

import com.example.productservice.model.ProductModel;
import com.example.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<ProductModel> getAll(){
        return productRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public ProductModel getById(@PathVariable Long id){
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    @PostMapping
    public ProductModel createProduct(@RequestBody ProductModel newProduct){
        return productRepository.save(newProduct);
    }

}
