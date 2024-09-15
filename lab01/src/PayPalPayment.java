public class PayPalPayment implements IPaymentMethod {
    public void processPayment(double amount) {
            System.out.println("Processed payment of $" + amount + " using PayPal.");
    }
}
