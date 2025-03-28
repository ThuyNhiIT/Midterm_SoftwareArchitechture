package com.designpattern.KiemTra.state;
// Trạng thái "Đã hủy"
class CanceledState implements OrderState {
    public void sendRequest(OrderContext context) {
        System.out.println("Đơn hàng đã bị hủy, không thể xử lý tiếp.");
    }

    public void checkStatus() {
        System.out.println("Trạng thái: Đã hủy");
    }

    public void cancelOrder(OrderContext context) {
        System.out.println("Đơn hàng đã bị hủy trước đó.");
    }
}
