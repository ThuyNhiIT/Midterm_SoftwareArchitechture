package com.designpattern.Bai02.p3;

// Decorator Pattern: Thêm tính năng bổ sung cho thanh toán
public abstract class PaymentDecorator implements PaymentStrategy {
    protected PaymentStrategy decoratedPayment;

    public PaymentDecorator(PaymentStrategy decoratedPayment) {
        this.decoratedPayment = decoratedPayment;
    }
}