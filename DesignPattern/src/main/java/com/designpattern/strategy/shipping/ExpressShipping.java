package com.designpattern.strategy.shipping;

class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateShippingFee(double weight) {
        return weight * 10; // Mỗi kg tính 10k
    }
}