package com.designpattern.strategy.shipping;

class SameDayShipping implements ShippingStrategy {
    @Override
    public double calculateShippingFee(double weight) {
        return weight * 20 + 50; // Mỗi kg 20k + phí dịch vụ 50k
    }
}