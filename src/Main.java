public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.confirmOrder(); // chuyển trạng thái từ "Đã đặt hàng" sang "Đã xác nhận"
        order.shipOrder(); // in ra thông báo "Cannot ship order until it is confirmed."
        order.cancelOrder(); // chuyển trạng thái từ "Đã xác nhận" sang "Đã hủy"

        order.confirmOrder(); // in ra thông báo "Order has been cancelled and cannot be confirmed."
        order.shipOrder(); // in ra thông báo "Order has been cancelled and cannot be shipped."
        order.cancelOrder(); // in ra thông báo "Order has already been cancelled."

    }
}