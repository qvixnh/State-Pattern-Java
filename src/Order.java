public class Order {
    private OrderState state;

    public Order() {
        this.state = new OrderPlacedState(this);
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void confirmOrder() {
        state.confirmOrder();
    }

    public void shipOrder() {
        state.shipOrder();
    }

    public void cancelOrder() {
        state.cancelOrder();
    }
}
