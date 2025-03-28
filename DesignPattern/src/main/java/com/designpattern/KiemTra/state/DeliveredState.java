package com.designpattern.KiemTra.state;

// Trạng thái "Đã giao"
class DeliveredState implements OrderState {
    public void sendRequest(OrderContext context) {
        System.out.println("Đơn hàng đã giao thành công.");
    }

    public void checkStatus() {
        System.out.println("Trạng thái: Đã giao");
    }

    public void cancelOrder(OrderContext context) {
        System.out.println("Không thể hủy đơn khi đã giao. Chỉ có thể trả hàng.");
        context.setState(new ReturnState()); // Chuyển sang "Trả hàng"
    }
}