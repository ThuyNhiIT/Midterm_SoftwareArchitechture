package com.designpattern.KiemTra.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Hình tròn bình thường
        Shape circle = new Circle();
        System.out.println("Hình tròn bình thường:");
        circle.draw();

        // Hình tròn có màu sắc và đường viền
        System.out.println("\nHình tròn có màu sắc và đường viền:");
        Shape coloredCircle = new ColorDecorator(new BorderDecorator(new Circle()));
        coloredCircle.draw();

        // Hình chữ nhật có bóng đổ
        System.out.println("\nHình chữ nhật có bóng đổ:");
        Shape shadowRectangle = new ShadowDecorator(new Rectangle());
        shadowRectangle.draw();
    }
}
