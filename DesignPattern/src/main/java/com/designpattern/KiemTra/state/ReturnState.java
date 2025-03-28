package com.designpattern.KiemTra.state;

// Trạng thái "Trả hàng"
class ReturnState implements OrderState {
    public void sendRequest(OrderContext context) {
        System.out.println("Đơn hàng đang trong quá trình trả hàng...");
    }

    public void checkStatus() {
        System.out.println("Trạng thái: Đang trả hàng");
    }

    public void cancelOrder(OrderContext context) {
        System.out.println("Không thể hủy, đơn hàng đang trong quá trình trả.");
    }
}