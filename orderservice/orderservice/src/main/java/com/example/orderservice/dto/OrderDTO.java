package com.example.orderservice.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class OrderDTO {

    private Long id;

    @NotBlank(message = "User is mandatory for any order")
    private Long userId;

    @NotBlank(message = "Product is mandatory")
    private String product;

    // Constructor with all fields
    public OrderDTO(Long id, Long userId, String product) {
        this.id = id;
        this.userId = userId;
        this.product = product;
    }
}