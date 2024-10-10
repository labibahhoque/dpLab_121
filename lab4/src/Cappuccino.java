public class Cappuccino extends Beverage{
    public Cappuccino(Condiments condiments) {
        super(condiments);
    }
    public void Description(){
        System.out.println("Cappuccino");
    }
    public double Cost(){
        return condiments.Cost()+1.00;
    }
}
