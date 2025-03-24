package com.designpattern.strategy.shipping;

public class Main {
    public static void main(String[] args) {
        ShippingService shipping = new ShippingService();

        shipping.setShippingStrategy(new StandardShipping());
        System.out.println("Standard Shipping: " + shipping.calculateFee(5) + "k");

        shipping.setShippingStrategy(new ExpressShipping());
        System.out.println("Express Shipping: " + shipping.calculateFee(5) + "k");

        shipping.setShippingStrategy(new SameDayShipping());
        System.out.println("Same-Day Shipping: " + shipping.calculateFee(5) + "k");
    }
}
