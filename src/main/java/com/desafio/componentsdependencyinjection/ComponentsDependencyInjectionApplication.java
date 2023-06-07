package com.desafio.componentsdependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio.componentsdependencyinjection.entities.Order;
import com.desafio.componentsdependencyinjection.services.OrderService;
//import com.desafio.componentsdependencyinjection.services.ShippingService;

@SpringBootApplication
public class ComponentsDependencyInjectionApplication implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	Order order1 = new Order(1034, 150.0, 0.2);
	Order order2 = new Order(2282, 800.0, 0.10);
	Order order3 = new Order(1309, 95.90, 0.0);

	public static void main(String[] args) {
		SpringApplication.run(ComponentsDependencyInjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.printf("%nPedido código %d%n", order2.getCode()); 
		System.out.printf("Valor total: %.2f%n", orderService.total(order2)); 
	}
}