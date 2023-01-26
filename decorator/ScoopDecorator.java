package decorator;

/**
 * The flavor and cost of the ice cream
 * @author Anna Phan
 */
public abstract class ScoopDecorator extends IceCream {
    protected IceCream iceCream;
    protected int numScoops;
    protected String flavor;
    protected double flavorCost;

    /**
     * Creates the ice cream flavor 
     * @param iceCream the container of the ice cream - cone or bowl
     * @param numScoops the number of scoops ordered
     */
    public ScoopDecorator(IceCream iceCream, int numScoops) {
        this.iceCream = iceCream;
        this.numScoops = numScoops;
    }

    /**
     * Creates a String representation of the ice cream order
     */
    public String toString() {
        if (numScoops == 1) {
            return iceCream.toString() + ", a scoop of " + flavor + " ice cream";
        }
        return iceCream.toString() + ", " + numScoops + " scoops of " + flavor + " ice cream";
    }

    /**
     * The total cost of the ice cream
     * @return the price of the order
     */
    public double getCost() {
        return numScoops * flavorCost + iceCream.getCost();
    }
}
