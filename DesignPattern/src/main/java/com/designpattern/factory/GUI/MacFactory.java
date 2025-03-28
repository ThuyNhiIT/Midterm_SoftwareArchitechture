package com.designpattern.factory.GUI;

public class MacFactory implements GUIFactory {
    @Override
    public Button creteButton() {
        return new MacButton();
    }

    @Override
    public Checkbox creteCheckbox() {
        return new MacCheckbox();
    }
}
