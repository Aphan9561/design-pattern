package decorator;

public abstract class ScoopDecorator extends IceCream {
    protected IceCream iceCream;
    protected int numScoops;
    protected String flavor;
    protected double flavorCost;

    public ScoopDecorator(IceCream iceCream, int numScoops) {
        this.iceCream = iceCream;
        this.numScoops = numScoops;
    }

    public String toString() {
        if(numScoops == 1)
        {
            return iceCream.toString() + ", a scoop of " + flavor + " ice cream";
        }

        return iceCream.toString() + ", "+ numScoops + " scoops of " + flavor + " ice cream";
    }

    public double getCost()
    {
        double scoops = numScoops;
        double cost = scoops*flavorCost;
        return cost + iceCream.getCost();
    }
}
