package com.desafio.componentsdependencyinjection.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.componentsdependencyinjection.entities.Order;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;
    
    public double total(Order order) {
        double calc = (order.getBasic() - (order.getDiscount() * order.getBasic())) + shippingService.shipment(order);
        return calc;
    }
}
