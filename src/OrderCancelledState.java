public class OrderCancelledState extends OrderState {
    public OrderCancelledState(Order order) {
        super(order);
    }

    @Override
    public void confirmOrder() {
        System.out.println("Order has been cancelled and cannot be confirmed.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order has been cancelled and cannot be shipped.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order has already been cancelled.");
    }
}
