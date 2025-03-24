package com.designpattern.strategy.shipping;

// 2. Các thuật toán cụ thể
class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateShippingFee(double weight) {
        return weight * 5; // Mỗi kg tính 5k
    }
}