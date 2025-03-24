package com.designpattern.state.vendingMachine;

// 2. Các trạng thái cụ thể
class NoCoinState implements State {
    private VendingMachine machine;

    public NoCoinState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Bạn đã đưa tiền vào.");
        machine.setState(machine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("Không có tiền để trả lại.");
    }

    @Override
    public void pressButton() {
        System.out.println("Bạn cần đưa tiền vào trước.");
    }

    @Override
    public void dispense() {
        System.out.println("Không thể phát hàng khi chưa có tiền.");
    }
}
