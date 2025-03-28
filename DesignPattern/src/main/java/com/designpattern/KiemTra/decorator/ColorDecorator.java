package com.designpattern.KiemTra.decorator;

// Decorator thêm màu sắc
public class ColorDecorator extends ShapeDecorator {
    public ColorDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        addColor();
    }

    private void addColor() {
        System.out.println("Thêm màu sắc");
    }
}
