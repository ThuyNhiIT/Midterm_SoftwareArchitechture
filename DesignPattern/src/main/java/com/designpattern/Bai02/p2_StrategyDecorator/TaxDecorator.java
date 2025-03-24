package com.designpattern.Bai02.p2_StrategyDecorator;

public class TaxDecorator implements TaxStrategy {
    private TaxStrategy baseTax;
    private TaxStrategy additionalTax;

    public TaxDecorator(TaxStrategy baseTax, TaxStrategy additionalTax) {
        this.baseTax = baseTax;
        this.additionalTax = additionalTax;
    }

    @Override
    public double calculateTax(double price) {
        return baseTax.calculateTax(price) + additionalTax.calculateTax(price);
    }
}