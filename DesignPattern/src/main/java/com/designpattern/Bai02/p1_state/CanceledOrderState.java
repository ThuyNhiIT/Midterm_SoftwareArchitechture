package com.designpattern.Bai02.p1_state;

public class CanceledOrderState implements OrderState{
    @Override
    public void xuLyYeuCau() {
        System.out.println("Hủy đơn hàng");
    }
}
