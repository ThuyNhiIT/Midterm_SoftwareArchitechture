package com.designpattern.state.vendingMachine;

// 3. Lớp chính Vending Machine - Máy bán hàng tự động
class VendingMachine {
    private State noCoinState; // Không có xu
    private State hasCoinState; // Có xu
    private State dispensingState; // Phân phối
    private State currentState; // Hiện tại

    public VendingMachine() {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        dispensingState = new DispensingState(this);
        currentState = noCoinState; // Hiện tại ban đầu không có xu
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getNoCoinState() { return noCoinState; }
    public State getHasCoinState() { return hasCoinState; }
    public State getDispensingState() { return dispensingState; }

    public void insertCoin() { currentState.insertCoin(); }
    public void ejectCoin() { currentState.ejectCoin(); }
    public void pressButton() { currentState.pressButton(); }
    public void dispense() { currentState.dispense(); }
}
