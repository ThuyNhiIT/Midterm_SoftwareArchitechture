package com.designpattern.factory.GUI;

public class WinFactory implements GUIFactory {
    @Override
    public Button creteButton() {
       return new WinButton();
    }

    @Override
    public Checkbox creteCheckbox() {
        return new WinCheckbox();
    }

}
