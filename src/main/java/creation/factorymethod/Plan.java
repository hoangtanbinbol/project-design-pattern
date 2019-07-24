package creation.factorymethod;

/**
 * Created by pht on 23/07/2019.
 */
public abstract class Plan {
    protected double rate;
    abstract void getRate();

    public void calculateBil(int units) {
        System.out.print(units * rate);
    }
}
