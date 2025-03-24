package com.designpattern.state.bank;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(1000);
        account.withdraw(500);

        account.setState(new FrozenState());
        account.withdraw(200);

        account.setState(new ClosedState());
        account.deposit(300);
    }
}
