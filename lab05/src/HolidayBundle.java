import java.util.List;
import java.util.ArrayList;
public class HolidayBundle extends Bundle {
    public HolidayBundle(){
        this.name = "Holiday Bundle";
        this.description = "Bundle of fun gadgets";
        this.discount = 0.4;
        this.products = new ArrayList<>();

        this.addProducts(new Laptop());
        this.addProducts(new Phone());
    }
}
