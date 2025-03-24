package com.designpattern.state.bank;

public class ClosedState implements AccountState {
    @Override
    public void deposit(double amount) {
        System.out.println("Tài khoản đã đóng, không thể gửi tiền.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Tài khoản đã đóng, không thể rút tiền.");
    }
}