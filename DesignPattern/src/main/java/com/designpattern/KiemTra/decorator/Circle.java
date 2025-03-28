package com.designpattern.KiemTra.decorator;

// Lớp Circle (Hình tròn)
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Vẽ hình tròn");
    }
}