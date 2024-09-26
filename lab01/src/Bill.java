public class Bill {
    private IPaymentMethod paymentMethod;

    public void Bill(IPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay(double amount) {
        paymentMethod.processPayment(amount);
    }
}
