package com.designpattern.Bai02.p3;

public class PaymentSystemDemo {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentStrategy paypal = new PayPalPayment();

        // Thanh toán bằng thẻ tín dụng có phí xử lý
        PaymentStrategy creditWithFee = new ProcessingFeeDecorator(creditCard, 2.5);

        // Thanh toán bằng PayPal có mã giảm giá
        PaymentStrategy paypalWithDiscount = new DiscountDecorator(paypal, 5.0);

        // Thanh toán với cả phí xử lý và giảm giá
        PaymentStrategy advancedPayment = new ProcessingFeeDecorator(new DiscountDecorator(creditCard, 5.0), 2.5);

        System.out.println("--- Thanh toán thường ---");
        creditCard.pay(100);
        paypal.pay(200);

        System.out.println("\n--- Thanh toán có phí xử lý ---");
        creditWithFee.pay(100);

        System.out.println("\n--- Thanh toán có mã giảm giá ---");
        paypalWithDiscount.pay(200);

        System.out.println("\n--- Thanh toán có cả phí xử lý và mã giảm giá ---");
        advancedPayment.pay(200);
    }
}