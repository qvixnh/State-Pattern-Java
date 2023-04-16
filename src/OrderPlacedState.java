public class OrderPlacedState extends OrderState {
    public OrderPlacedState(Order order) {
        super(order);
    }

    @Override
    public void confirmOrder() {
        order.setState(new OrderConfirmedState(order));
    }

    @Override
    public void shipOrder() {
        System.out.println("Cannot ship order until it is confirmed.");
    }

    @Override
    public void cancelOrder() {
        order.setState(new OrderCancelledState(order));
    }
}
