package com.designpattern.strategy.shipping;

// 1. Interface Strategy (Chiến lược vận chuyển)
public interface ShippingStrategy {
    double calculateShippingFee(double weight);
}