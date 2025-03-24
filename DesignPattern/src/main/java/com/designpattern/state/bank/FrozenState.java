package com.designpattern.state.bank;

public class FrozenState implements AccountState {
    @Override
    public void deposit(double amount) {
        System.out.println("Tài khoản bị đóng băng, không thể gửi tiền.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Tài khoản bị đóng băng, không thể rút tiền.");
    }
}
