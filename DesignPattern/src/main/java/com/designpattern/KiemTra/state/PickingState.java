package com.designpattern.KiemTra.state;


// Trạng thái "Chờ lấy hàng"
class PickingState implements OrderState {
    public void sendRequest(OrderContext context) {
        System.out.println("Đơn hàng đã sẵn sàng để vận chuyển.");
        context.setState(new ShippingState()); // Chuyển sang "Đang giao"
    }

    public void checkStatus() {
        System.out.println("Trạng thái: Chờ lấy hàng");
    }

    public void cancelOrder(OrderContext context) {
        System.out.println("Đơn hàng đã bị hủy.");
        context.setState(new CanceledState());
    }
}