package com.example.orderservice.controller;

import com.example.orderservice.model.OrderModel;
import com.example.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/order")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public List<OrderModel> getAll(){
        return orderRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public OrderModel getById(@PathVariable Long id){
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }

    @PostMapping
    public OrderModel createOrder(@RequestBody OrderModel newOrder){
        return orderRepository.save(newOrder);
    }
}
