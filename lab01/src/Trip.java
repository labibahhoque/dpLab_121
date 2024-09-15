public class Trip {
    private int id;
    private String pickupLocation;
    private String dropOffLocation;
    private IRideType rideType;
    private String status;
    private double fare;
    private double distance;
    private Driver driver;
    private boolean completed;

    public Trip(int id, String pickupLocation, String dropOffLocation, IRideType rideType, String status, double fare, double distance) {
        this.id = id;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.rideType = rideType;
        this.status = status;
        this.fare = fare;
        this.distance = distance;
        this.completed = false;
    }
    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }
    public double calculateTripValue() {
        return 0.2*distance*rideType.calculateFare(fare);
    }
    public void assignDriver(Driver driver){
        this.driver = driver;
        System.out.println("Driver " + driver.getName() + " assigned to the trip.");
    }
    public void completeTrip(){
        this.completed = true;
        System.out.println("Trip completed.");
    }
}



