public abstract class  OrderState {
    protected Order order;
    public OrderState(Order order) {
        this.order = order;
    }
    public abstract void confirmOrder();
    public abstract void shipOrder();
    public abstract void cancelOrder();
}

