package com.designpattern.state.bank;

// 2. Các trạng thái cụ thể
public class ActiveState implements AccountState {
    @Override
    public void deposit(double amount) {
        System.out.println("Gửi " + amount + " vào tài khoản.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Rút " + amount + " khỏi tài khoản.");
    }
}