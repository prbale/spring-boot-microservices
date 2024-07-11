package com.example.orderservice.controller;

import com.example.orderservice.dto.OrderDTO;
import com.example.orderservice.entity.Order;
import com.example.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<OrderDTO>> getOrdersByUserId(@PathVariable Long userId) {

        List<OrderDTO> orderDTOList = orderService.getOrdersByUserId(userId);
        return ResponseEntity.ok(orderDTOList);
    }

    @PostMapping
    public ResponseEntity<OrderDTO>  createOrder(@RequestBody OrderDTO orderDTO) {
        OrderDTO savedOrder =  orderService.saveOrder(orderDTO);
        return ResponseEntity.ok(savedOrder);
    }
}
