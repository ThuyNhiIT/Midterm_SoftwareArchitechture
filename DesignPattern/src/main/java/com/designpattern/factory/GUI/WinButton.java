package com.designpattern.factory.GUI;

public class WinButton implements Button {

    @Override
    public void render() {
        System.out.println("Win Button");
    }
}
