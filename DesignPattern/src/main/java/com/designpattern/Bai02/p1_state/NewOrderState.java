package com.designpattern.Bai02.p1_state;

public class NewOrderState implements OrderState {
    @Override
    public void xuLyYeuCau() {
        System.out.println("Tạo mới đơn hàng");
    }
}
