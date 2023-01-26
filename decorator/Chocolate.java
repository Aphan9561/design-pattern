package decorator;

/**
 * Chochlate ice cream
 * @author Anna Phan
 */
public class Chocolate extends ScoopDecorator {
    /**
     * Creates a new Chocolate ice cream
     * @param iceCream the container of the ice cream - cone or bowl
     * @param numScoops the number of chocolate scoop
     */
    public Chocolate(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        this.flavor = "chocolate";
        this.flavorCost = 1.50;
    }
}
