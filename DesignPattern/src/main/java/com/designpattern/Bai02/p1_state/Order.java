package com.designpattern.Bai02.p1_state;

public class Order {
    private OrderState state;

    public void setState(OrderState state) {

        this.state = state;
    }

    public void xuLyDonHang() {
        if (state != null) {
            state.xuLyYeuCau();
        } else {
            System.out.println("Chưa có trạng thái cho đơn hàng");
        }
    }}
