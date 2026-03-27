package com.phongvanptit.hello_spring;

import com.phongvanptit.hello_spring.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(HelloSpringApplication.class, args);
//		SpringApplication.run(HelloSpringApplication.class, args);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.createOrder("Laptop");
    }

}
