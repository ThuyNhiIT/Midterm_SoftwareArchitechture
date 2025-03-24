package com.designpattern.strategy.payment;

class CashOnDelivery implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " khi nhận hàng.");
    }
}