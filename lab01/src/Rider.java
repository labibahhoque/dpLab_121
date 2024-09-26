public class Rider extends User {
    private int id;
    private String name;
    private String location;
    private IPaymentMethod preferredPayment;
    private double rating;
    public Rider(int id, String name, String location, IPaymentMethod preferredPayment) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.preferredPayment = preferredPayment;
        this.rating = 0.0;
    }

    public void requestRide(Trip trip) {
        System.out.println(name + " requested a ride from " + trip.getPickupLocation() + " to " + trip.getDropOffLocation());
    }
    public void rateDriver(Driver driver) {
        driver.updateRating(rating);
    }
    public void makePayment(Trip trip) {
        double fare=trip.calculateTripValue();
        preferredPayment.processPayment(fare);
    }
    public void updateRating(double newRating) {
        rating = (rating + newRating) / 2;
    }
    public double calculateRating(){
        return rating;
    }
}
