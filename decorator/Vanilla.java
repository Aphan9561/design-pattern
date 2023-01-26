package decorator;

public class Vanilla extends ScoopDecorator {
    public Vanilla(IceCream iceCream, int numScoops)
    {
        super(iceCream, numScoops);
        this.flavor = "vanilla";
        this.flavorCost = 1.25;
    }

}
