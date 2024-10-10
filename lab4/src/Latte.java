public class Latte extends Beverage{
    public Latte(Condiments condiments) {
        super(condiments);
    }
    public void Description(){
        System.out.println("Latte");
    }
    public double Cost(){
        return condiments.Cost()+2.99;
    }

}
