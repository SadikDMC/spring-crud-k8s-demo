package com.learning.spring_crud_k8s_demo.controller;

import com.learning.spring_crud_k8s_demo.entity.Order;
import com.learning.spring_crud_k8s_demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @RestController
    @RequestMapping("/orders")
    public class orderController {

        @Autowired
        private OrderService service;

        @PostMapping
        public Order addOrder(@RequestBody Order order){
            return service.addOrder(order);
        }

        @GetMapping
        public List<Order> getOrders(){
            return service.getOrders();
        }

        @GetMapping("/{id}")
        public Order getOrderById(@PathVariable int id){
            return service.getOrderById(id);
        }
    }
}
