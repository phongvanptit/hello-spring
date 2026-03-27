package com.phongvanptit.hello_spring.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void send(String message) {
        System.out.println("Thông báo: " + message);
    }
}