package com.designpattern.Bai02.p2_StrategyDecorator;

public class VATTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.1; // Thuế VAT 10%
    }

}