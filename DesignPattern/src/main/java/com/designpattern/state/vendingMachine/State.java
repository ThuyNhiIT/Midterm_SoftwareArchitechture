package com.designpattern.state.vendingMachine;

public interface State {
    void insertCoin(); // Nhét xu
    void ejectCoin(); // Lấy xu
    void pressButton(); // Nhấn nút
    void dispense(); // Máy phân phối
}