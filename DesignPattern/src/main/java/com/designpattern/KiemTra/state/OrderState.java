package com.designpattern.KiemTra.state;

public interface OrderState {
    void sendRequest(OrderContext context);
    void checkStatus();
    void cancelOrder(OrderContext context);
}
