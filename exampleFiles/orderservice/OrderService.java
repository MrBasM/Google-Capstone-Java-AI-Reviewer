public class OrderService {

    public enum OrderStatus {
        NEW, PROCESSING, COMPLETED, CANCELLED
    }

    private String orderId;
    private OrderStatus status;
    private double totalAmount;

    public OrderService(String orderId) {
        this.orderId = orderId;
        this.status = OrderStatus.NEW;
        this.totalAmount = 0.0;
    }

    public void addItem(double price, int quantity) {
        if (price <= 0 || quantity <= 0) {
            System.out.println("Invalid item details.");
            return;
        }
        double itemTotal = price * quantity;
        totalAmount += itemTotal;
        System.out.println("Added item: " + quantity + " x $" + price + " = $" + itemTotal);
    }

    public void processOrder() {
        if (status != OrderStatus.NEW) {
            System.out.println("Order cannot be processed. Current status: " + status);
            return;
        }
        status = OrderStatus.PROCESSING;
        System.out.println("Order is now processing.");
    }

    public void completeOrder() {
        if (status != OrderStatus.PROCESSING) {
            System.out.println("Order cannot be completed. Current status: " + status);
            return;
        }
        status = OrderStatus.COMPLETED;
        System.out.println("Order completed. Total amount: $" + totalAmount);
    }

    public void cancelOrder() {
        if (status == OrderStatus.COMPLETED) {
            System.out.println("Cannot cancel a completed order.");
            return;
        }
        status = OrderStatus.CANCELLED;
        System.out.println("Order has been cancelled.");
    }

    public OrderStatus getStatus() {
        return status;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

