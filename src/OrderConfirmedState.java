
public class OrderConfirmedState extends OrderState {
    public OrderConfirmedState(Order order) {
        super(order);
    }

    @Override
    public void confirmOrder() {
        System.out.println("Order has already been confirmed.");
    }

    @Override
    public void shipOrder() {
        order.setState(new OrderShippedState(order));
    }

    @Override
    public void cancelOrder() {
        order.setState(new OrderCancelledState(order));
    }
}
