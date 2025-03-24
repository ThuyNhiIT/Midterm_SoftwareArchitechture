package com.designpattern.strategy.shipping;

// 3. Lớp Context (Giao hàng)
class ShippingService {
    private ShippingStrategy strategy;

    public void setShippingStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateFee(double weight) {
        return strategy.calculateShippingFee(weight);
    }
}