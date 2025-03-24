package com.designpattern.Bai02.p1_state;

public class DeliveredOrderState implements OrderState {
    @Override
    public void xuLyYeuCau() {
        System.out.println("Đã giao");
    }
}
