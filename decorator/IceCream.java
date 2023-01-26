package decorator;

/**
 * An Ice Cream Shop
 * @author Anna Phan
 */
public abstract class IceCream {
    protected String description;

    /**
     * Creates a String representation of a cone or bowl
     */
    public String toString() {
        return description;
    }

    /**
     * the cost of the type of cone or bowl
     * @return the price of the type of cone/bowl
     */
    public abstract double getCost();
}