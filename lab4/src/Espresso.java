public class Espresso extends Beverage {
    public Espresso(Condiments condiments) {
        super(condiments);
    }
    public void Description(){
        System.out.println("Espresso");
    }
    public double Cost(){
        return condiments.Cost()+1.99;
    }
}
