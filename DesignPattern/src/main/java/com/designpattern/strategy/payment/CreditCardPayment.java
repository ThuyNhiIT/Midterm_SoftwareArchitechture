package com.designpattern.strategy.payment;

class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng thẻ tín dụng: " + cardNumber);
    }
}