package decorator;

public class Cone extends IceCream {
    private ConeType coneType;

    public Cone(ConeType coneType) {
        if (coneType == coneType.SUGAR_CONE)
        {
            this.description = "Sugar cone";
        }
        else if (coneType == coneType.WAFFLE_CONE)
        {
            this.description = "Waffle cone";
        }
        else if (coneType == coneType.PREZTAL_CONE)
        {
            this.description = "Preztal Cone";
        }
        else if (coneType == coneType.CHOCOLATE_DIPPED_CONE)
        {
            this.description = "Chocolate dipped cone";
        }
    }
    
    public double getCost()
    {
        
        if (coneType == coneType.SUGAR_CONE)
        {
            return 0.75;
        }
        else if (coneType == coneType.WAFFLE_CONE)
        {
            return 1.20;
        }
        else if (coneType == coneType.PREZTAL_CONE)
        {
            return 1.80;
        }
        else 
        {
            return 1.50;
        }

    }
}
