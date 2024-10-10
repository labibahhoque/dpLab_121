public abstract class Beverage implements Condiments{
    protected Condiments condiments;
    public Beverage(Condiments condiments) {
        this.condiments = condiments;
    }


}
