package com.desafio.componentsdependencyinjection.entities;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    
    private Integer code;
    private Double basic;
    private Double discount;

}
