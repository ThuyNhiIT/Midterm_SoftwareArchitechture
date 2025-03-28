package com.designpattern.KiemTra.state;
// Trạng thái "Chờ xác nhận"
class WaitingState implements OrderState {
    public void sendRequest(OrderContext context) {
        System.out.println("Đơn hàng đã được xác nhận.");
        context.setState(new PickingState()); // Chuyển sang trạng thái "Chờ lấy hàng"
    }

    public void checkStatus() {
        System.out.println("Trạng thái: Chờ xác nhận");
    }

    public void cancelOrder(OrderContext context) {
        System.out.println("Đơn hàng đã bị hủy.");
        context.setState(new CanceledState()); // Chuyển sang "Đã hủy"
    }
}