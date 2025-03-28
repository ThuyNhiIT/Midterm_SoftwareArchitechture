package com.designpattern.KiemTra.decorator;

// Lớp Rectangle (Hình chữ nhật)
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Vẽ hình chữ nhật");
    }
}