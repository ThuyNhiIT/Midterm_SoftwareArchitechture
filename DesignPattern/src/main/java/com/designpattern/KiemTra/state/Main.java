package com.designpattern.KiemTra.state;

public class Main {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        // Kiểm tra trạng thái ban đầu
        order.checkStatus();  // "Trạng thái: Chờ xác nhận"

        // Xác nhận đơn hàng -> Chờ lấy hàng
        order.sendRequest();
        order.checkStatus();  // "Trạng thái: Chờ lấy hàng"

        // Hủy đơn hàng khi đang ở trạng thái "Chờ lấy hàng"
        order.cancelOrder();
        order.checkStatus();  // "Trạng thái: Đã hủy"

        // Reset lại đơn hàng để test tiếp các trường hợp khác
        order.setState(new WaitingState());

        // Xác nhận -> Chờ lấy hàng -> Đang giao
        order.sendRequest();
        order.sendRequest();
        order.checkStatus();  // "Trạng thái: Đang giao"

        // Thử hủy đơn hàng khi đang giao
        order.cancelOrder();  // "Không thể hủy đơn khi đang vận chuyển!"

        // Đơn hàng giao thành công
        order.setState(new DeliveredState());
        order.checkStatus();  // "Trạng thái: Đã giao"

        // Thử hủy đơn hàng khi đã giao
        order.cancelOrder();  // "Không thể hủy đơn khi đã giao. Chỉ có thể trả hàng."

        // Trả hàng
        order.checkStatus();  // "Trạng thái: Đang trả hàng"
    }
}
