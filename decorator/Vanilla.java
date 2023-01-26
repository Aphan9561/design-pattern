package decorator;

/**
 * Vanilla ice cream 
 * @author Anna Phan
 */
public class Vanilla extends ScoopDecorator {
    
    /**
     * Creates a new vanilla ice cream
     * @param iceCream the container of the ice cream - cone or bowl
     * @param numScoops the number of vanilla scoops
     */
    public Vanilla(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        this.flavor = "vanilla";
        this.flavorCost = 1.25;
    }

}
