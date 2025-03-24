package com.designpattern.state.vendingMachine;

public interface State {
    void insertCoin();
    void ejectCoin();
    void pressButton();
    void dispense();
}