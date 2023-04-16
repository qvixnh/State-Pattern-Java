
public class OrderShippedState extends OrderState {
    public OrderShippedState(Order order) {
        super(order);
    }

    @Override
    public void confirmOrder() {
        System.out.println("Order has already been shipped.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order has already been shipped.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Cannot cancel order after it has been shipped.");
    }
}
