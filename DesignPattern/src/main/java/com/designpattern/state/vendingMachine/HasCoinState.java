package com.designpattern.state.vendingMachine;

class HasCoinState implements State {
    private VendingMachine machine;

    public HasCoinState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Bạn đã đưa tiền rồi.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Trả lại tiền...");
        machine.setState(machine.getNoCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("Đang xử lý yêu cầu...");
        machine.setState(machine.getDispensingState());
    }

    @Override
    public void dispense() {
        System.out.println("Chưa nhấn nút chọn sản phẩm.");
    }
}