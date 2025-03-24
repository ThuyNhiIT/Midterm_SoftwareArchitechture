package com.designpattern.strategy.payment;

class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " qua PayPal: " + email);
    }
}