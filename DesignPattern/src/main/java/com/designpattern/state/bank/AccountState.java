package com.designpattern.state.bank;

// 1. Interface State
public interface AccountState {
    void deposit(double amount);
    void withdraw(double amount);
}
