package com.designpattern.strategy.payment;

// 1. Interface Strategy (Chiến lược thanh toán)
public interface PaymentStrategy {
    void pay(double amount);
}