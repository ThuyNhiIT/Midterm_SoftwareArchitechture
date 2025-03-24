package com.designpattern.Bai02.p3;

// Phí xử lý giao dịch
public class ProcessingFeeDecorator extends PaymentDecorator {
    private double fee;

    public ProcessingFeeDecorator(PaymentStrategy decoratedPayment, double fee) {
        super(decoratedPayment);
        this.fee = fee;
    }

    @Override
    public void pay(double amount) {
        double total = amount + fee;
        System.out.println("Thêm phí xử lý: " + fee);
        decoratedPayment.pay(total);
    }
}
