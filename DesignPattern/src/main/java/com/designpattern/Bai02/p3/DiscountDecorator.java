package com.designpattern.Bai02.p3;

public class DiscountDecorator extends PaymentDecorator {
    private double discount;

    public DiscountDecorator(PaymentStrategy decoratedPayment, double discount) {
        super(decoratedPayment);
        this.discount = discount;
    }

    @Override
    public void pay(double amount) {
        double total = amount - discount;
        System.out.println("Áp dụng mã giảm giá: " + discount);
        decoratedPayment.pay(total);
    }
}
