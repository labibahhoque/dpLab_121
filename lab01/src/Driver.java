public class Driver extends User {
    public int id;
    public String name;
    public String vehicleType;
    public String location;
    public double rating;
    public boolean isAvailable;

    public Driver(int id, String name, String vehicleType, String location, double rating, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.vehicleType = vehicleType;
        this.location = location;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }

    public void acceptRide(){
        if(isAvailable){
            System.out.println(name + " accepted the ride.");
            isAvailable = false;
        }
    }
    public String getName() {
        return name;
    }
    public void completeTrip() {
        System.out.println(name + " completed the trip.");
        isAvailable = true;
    }
    public void rateRider(Rider rider){
        rider.updateRating(rating);
    }
    public void updateLocation(Trip trip){
        trip.getDropOffLocation();
    }
    public void updateRating(double newRating) {
        rating = (rating + newRating) / 2;
    }
    public void startTrip(Trip trip){
        if(location==trip.getPickupLocation()){
            System.out.println(name + " started the trip.");
        }
    }
    public double calculateRating(){
        return rating;
    }
}
