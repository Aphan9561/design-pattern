package decorator;

/**
 * Cone to hold the ice cream
 * @author Anna Phan
 */
public class Cone extends IceCream {
    private ConeType coneType;

    /**
     * Creates a new cone for the customer
     * @param coneType the type of cone that is ordered
     */
    public Cone(ConeType coneType) {
        if (coneType == coneType.SUGAR_CONE) {
            this.description = "Sugar cone";
        } else if (coneType == coneType.WAFFLE_CONE) {
            this.description = "Waffle cone";
        } else if (coneType == coneType.PREZTAL_CONE) {
            this.description = "Preztal Cone";
        } else if (coneType == coneType.CHOCOLATE_DIPPED_CONE) {
            this.description = "Chocolate dipped cone";
        }
    }

    /**
     * The cost of the type of cone
     * @return The price of each cone
     */
    public double getCost() {

        if (coneType == coneType.SUGAR_CONE) {
            return 0.75;
        } else if (coneType == coneType.WAFFLE_CONE) {
            return 1.20;
        } else if (coneType == coneType.PREZTAL_CONE) {
            return 1.80;
        } else {
            return 1.50;
        }

    }
}
