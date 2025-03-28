package com.designpattern.KiemTra.state;

// Trạng thái "Đang giao"
class ShippingState implements OrderState {
    public void sendRequest(OrderContext context) {
        System.out.println("Đơn hàng đang trên đường giao...");

    }

    public void checkStatus() {
        System.out.println("Trạng thái: Đang giao");
    }

    public void cancelOrder(OrderContext context) {
        System.out.println("Không thể hủy đơn khi đang vận chuyển!");
    }
}
