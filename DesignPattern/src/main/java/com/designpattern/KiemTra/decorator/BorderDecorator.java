package com.designpattern.KiemTra.decorator;

// Decorator thêm đường viền
public class BorderDecorator extends ShapeDecorator {
    public BorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        addBorder();
    }

    private void addBorder() {
        System.out.println("Thêm đường viền");
    }
}
