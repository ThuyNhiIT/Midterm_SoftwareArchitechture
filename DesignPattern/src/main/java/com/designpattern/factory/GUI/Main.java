package com.designpattern.factory.GUI;

public class Main {
    public static void main(String[] args) {
        GUIFactory win = new WinFactory();
        Button button = win.createButton();
        Checkbox checkbox = win.createCheckbox();


        button.render();
        checkbox.render();

        GUIFactory mac = new MacFactory();
        Button button1 = mac.createButton();
        Checkbox checkbox1 = mac.createCheckbox();

        button1.render();
        checkbox1.render();
    }


}
