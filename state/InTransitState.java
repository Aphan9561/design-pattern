package state;

/**
 * Package in transit
 * @author Anna Phan
 */
public class InTransitState extends State {
    private int days = 5;
    /**
     * Creates a new packge in transit
     * @param pkg package name 
     * @param quantity how many there is 
     */
    public InTransitState(Package pkg, int quantity) {
        super(pkg, quantity);
    }
    /**
     * transit status
     * @return status message
     */
    @Override
    public String getStatus() {
        return "The " + pkg.getName() + " " + getVerb("is", "are") + " out for delivery.";
    }
    /**
     * transit ETA
     * @return ETA message
     */
    @Override
    public String getETA() {
        return "The " + pkg.getName() + " should arrive within " + days + " days.";
    }
    /**
     * transit delay
     * @return delay message
     */
    @Override
    public String delay() {
        days += 3;
        return "The " + pkg.getName() + " " + getVerb("has", "have") + " experenced a delay in shipping. \nThe "
                + pkg.getName() + " should arrive within " + days + " days.";
    }
}
