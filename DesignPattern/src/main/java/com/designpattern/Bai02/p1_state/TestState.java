package com.designpattern.Bai02.p1_state;

public class TestState {
    public static void main(String[] args) {
        Order order = new Order();
        // Create new OrderState
        order.setState(new NewOrderState());
        order.xuLyDonHang();

        // ProcessingOrderState
        order.setState(new ProcessingOrderState());
        order.xuLyDonHang();

        // DeliveredOrderState
        order.setState(new DeliveredOrderState());//Da giao hang
        order.xuLyDonHang();

        // CanceledOrderState
        order.setState(new CanceledOrderState());//Huy don hang
        order.xuLyDonHang();
    }
}
