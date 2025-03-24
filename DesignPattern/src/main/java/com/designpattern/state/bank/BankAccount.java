package com.designpattern.state.bank;

public class BankAccount {
    private AccountState state;

    public BankAccount() {
        this.state = new ActiveState(); // Mặc định tài khoản hoạt động
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposit(double amount) {
        state.deposit(amount);
    }

    public void withdraw(double amount) {
        state.withdraw(amount);
    }
}
