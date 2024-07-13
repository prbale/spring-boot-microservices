package com.example.userservice.dto;

import com.example.userservice.entity.Order;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
public class UserDTO {

    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is mandatory")
    private String email;

    private ArrayList<Order> orders;

    // Constructor with all fields
    public UserDTO(Long id, String name, String email, ArrayList<Order> orders) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.orders = orders;
    }
}