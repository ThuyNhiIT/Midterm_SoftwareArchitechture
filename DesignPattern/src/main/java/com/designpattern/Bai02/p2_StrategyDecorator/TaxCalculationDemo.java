package com.designpattern.Bai02.p2_StrategyDecorator;

public class TaxCalculationDemo {
    public static void main(String[] args) {
        // Tạo các sản phẩm với các loại thuế khác nhau
        Product laptop = new Product("Laptop", 1000, new VATTax());
        Product perfume = new Product("Nước hoa", 500, new LuxuryTax());
        Product soda = new Product("Nước ngọt", 50, new ConsumptionTax());

        // Kết hợp thuế VAT và Thuế xa xỉ cho một sản phẩm
        Product luxuryWatch = new Product("Đồng hồ xa xỉ", 2000, new TaxDecorator(new VATTax(), new LuxuryTax()));

        // Hiển thị thông tin sản phẩm
        laptop.displayInfo();
        perfume.displayInfo();
        soda.displayInfo();
        luxuryWatch.displayInfo();
    }
}
