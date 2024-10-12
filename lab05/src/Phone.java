public class Phone implements Product{
    private String name="Phone";
    private String description="Latest smartphone";
    private double price=1000;

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public void displayProductInfo() {
        System.out.println("Product: " + getName() + ", Description: " + getDescription() + ", Price: $" + getPrice());
    }
}
