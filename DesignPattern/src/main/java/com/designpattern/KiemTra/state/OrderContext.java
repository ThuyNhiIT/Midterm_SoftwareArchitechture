package com.designpattern.KiemTra.state;

class OrderContext {
    private OrderState state;

    public OrderContext() {
        this.state = new WaitingState(); // Mặc định "Chờ xác nhận"
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void sendRequest() {
        state.sendRequest(this);
    }

    public void checkStatus() {
        state.checkStatus();
    }

    public void cancelOrder() {
        state.cancelOrder(this);
    }
}
