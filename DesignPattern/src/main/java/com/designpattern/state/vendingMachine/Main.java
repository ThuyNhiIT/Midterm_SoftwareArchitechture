package com.designpattern.state.vendingMachine;

// 4. Kiểm thử chương trình
public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.insertCoin();
        machine.pressButton();
        machine.dispense();

        machine.insertCoin();
        machine.ejectCoin();
        machine.pressButton();
    }
}