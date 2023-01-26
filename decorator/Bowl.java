package decorator;

/**
 * A bowl ot hold the ice cream
 * @author Anna Phan
 */
public class Bowl extends IceCream {
    /**
     * Creates of new Bowl for the ice cream
     */
    public Bowl() {
        this.description = "Bowl";
    }

    /**
     * The cost of the bowl
     * @return the bowl's price
     */
    public double getCost() {
        return 0.0;
    }
}
