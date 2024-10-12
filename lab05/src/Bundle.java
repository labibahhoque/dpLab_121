import java.util.ArrayList;
import java.util.List;

public abstract class Bundle implements Product {
    protected  String name;
    protected  String description;
    protected double discount;
    protected List<Product>products;

    public Bundle() {
        this.products = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public void displayProductInfo() {
        System.out.println("Bundle: " + getName() + ", Description: " + getDescription() + ", Price: $" + getPrice());
        for (Product product : products) {
            product.displayProductInfo();
        }
    }
    public void addProducts(Product product) {
        products.add(product);
    };
    public double getPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total * (1 - discount);
    }
}
