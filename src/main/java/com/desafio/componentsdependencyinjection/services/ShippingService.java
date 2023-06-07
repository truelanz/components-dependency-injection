package com.desafio.componentsdependencyinjection.services;

import org.springframework.stereotype.Service;

import com.desafio.componentsdependencyinjection.entities.Order;

@Service
public class ShippingService {

    public double shipment(Order order) {
        if(order.getBasic() < 100.0) {
            return 20.0;
        } else if (order.getBasic() <= 200.0) {
            return 12.0;
        }
        return 0.0;
    }
}
