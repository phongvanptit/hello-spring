package com.phongvanptit.hello_spring.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final NotificationService notificationService;

    public OrderService(NotificationService service) {
        this.notificationService = service;
    }

    public void createOrder(String product) {
        System.out.println("Tạo đơn hàng: " + product);
        notificationService.send("Đơn hàng " + product + " đã được tạo!");
    }
}
