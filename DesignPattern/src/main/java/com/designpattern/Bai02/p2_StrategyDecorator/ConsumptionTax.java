package com.designpattern.Bai02.p2_StrategyDecorator;

public class ConsumptionTax  implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.05; // Thuế tiêu thụ 5%
    }
}