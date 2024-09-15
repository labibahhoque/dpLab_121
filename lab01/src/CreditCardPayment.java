public class CreditCardPayment implements IPaymentMethod {
    private String cardNumber;
    public void processPayment(double amount) {
        System.out.println("Processed payment of $" + amount + " using Credit Card Number"+cardNumber);
    }
}
