package com.designpattern.Bai02.p1_state;

public class ProcessingOrderState implements OrderState {
    @Override
    public void xuLyYeuCau() {
        System.out.println("Đơn hàng đang xử lý");
    }
}
