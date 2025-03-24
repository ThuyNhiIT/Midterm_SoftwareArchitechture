package com.designpattern.state.vendingMachine;

class DispensingState implements State {
    private VendingMachine machine;

    public DispensingState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Vui lòng đợi, sản phẩm đang được phát.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Không thể trả tiền khi đang phát hàng.");
    }

    @Override
    public void pressButton() {
        System.out.println("Sản phẩm đang được phát, vui lòng đợi.");
    }

    @Override
    public void dispense() {
        System.out.println("Sản phẩm đã được phát!");
        machine.setState(machine.getNoCoinState());
    }
}
