package com.designpattern.KiemTra.decorator;

// Decorator thêm bóng đổ
public class ShadowDecorator extends ShapeDecorator {
    public ShadowDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        addShadow();
    }

    private void addShadow() {
        System.out.println("Thêm bóng đổ");
    }
}