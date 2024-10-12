public class Laptop implements Product{
    private String name="Laptop";
    private String description="High-performance laptop";
    private double price=1500;

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
