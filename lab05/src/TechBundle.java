import java.util.List;
import java.util.ArrayList;

public class TechBundle extends Bundle{
   public TechBundle(){
       this.name = "Tech Bundle";
       this.description = "Bundle of tech gadgets";
       this.discount = 0.2;
       this.products = new ArrayList<>();

       this.addProducts(new Laptop());
       this.addProducts(new Phone());
   }
}
