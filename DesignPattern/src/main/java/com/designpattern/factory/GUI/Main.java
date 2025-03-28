package com.designpattern.factory.GUI;

public class Main {
    public static void main(String[] args) {
        GUIFactory win = new WinFactory();
        Button button = win.creteButton();
        Checkbox checkbox = win.creteCheckbox();


        button.render();
        checkbox.render();

        GUIFactory mac = new MacFactory();
        Button button1 = mac.creteButton();
        Checkbox checkbox1 = mac.creteCheckbox();

        button1.render();
        checkbox1.render();
    }


}
