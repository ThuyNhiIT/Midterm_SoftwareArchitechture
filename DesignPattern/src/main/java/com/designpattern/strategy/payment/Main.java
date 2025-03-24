package com.designpattern.strategy.payment;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        cart.checkout(500);

        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(750);

        cart.setPaymentStrategy(new CashOnDelivery());
        cart.checkout(1000);
    }
}
