package decorator;

/**
 * Strawberry ice cream
 * @author Anna Phan
 */
public class Strawberry extends ScoopDecorator {
    /**
     * Creates a new strawberry ice cream
     * @param iceCream the container of the ice cream - cone or bowl
     * @param numScoops the number of strawberry scoops
     */
    public Strawberry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        this.flavor = "strawberry";
        this.flavorCost = 1.40;
    }
}
