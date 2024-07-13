package com.example.userservice.entity;

import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Order {
    private Long id;
    private Long userId;
    private String product;

}
