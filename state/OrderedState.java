package state;

/**
 * Ordering package
 * @author Anna Phan
 */
public class OrderedState extends State {
    private int days = 2;
    /**
     * Creates a new ordered package
     * @param pkg package name 
     * @param quantity how many there is 
     */
    public OrderedState(Package pkg, int quantity) {
        super(pkg, quantity);
    }
    /**
     * order status
     * @return status message
     */
    @Override
    public String getStatus() {
        return "The " + pkg.getName() + " " + getVerb("is", "are") + " ordered.";
    }
    /**
     * order eta
     * @return ETA message
     */
    @Override
    public String getETA() {
        return "The " + pkg.getName() + " will be shipped within " + days + " business days.";
    }
    /**
     * order delay
     * @return delay message
     */
    @Override
    public String delay() {
        days += 2;
        return "The " + pkg.getName() + " experienced a slight delay in manufacturing.\nThe " + pkg.getName()
                + " will be shipped within " + days + " business days.";
    }

}
