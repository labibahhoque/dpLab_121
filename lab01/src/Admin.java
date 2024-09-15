import java.util.List;
public class Admin {
    private String name;
    private int id;
    private String role;

    public Admin(String name, int id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    public void manageDriver(List<Driver> drivers, Trip trip) {


    }
    public void manageRider(){}
    public void viewTripHistory(){}
    public void handleDispute(){}
}
