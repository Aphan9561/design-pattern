package state;

/**
 * Delivering package
 * @author Anna Phan
 */
public class DeliveredState extends State {
    /**
     * Creates a new delivered package
     * @param pkg package name 
     * @param quantity how many there is 
     */
    public DeliveredState(Package pkg, int quantity) {
        super(pkg, quantity);
    }
    /**
     * delivery status
     * @return status message
     */
    @Override
    public String getStatus() {
        return "The " + pkg.getName() + " " + getVerb("is", "are") + " here for you.";
    }
    /**
     * delivery ETA
     * @return ETA message
     */
    @Override
    public String getETA() {
        return "The " + pkg.getName() + " " + getVerb("is", "are") + " here.";
    }
    /**
     * delivery delay
     * @return delay message
     */
    @Override
    public String delay() {
        return "The " + pkg.getName() + getVerb("has", "have") + " has already been delivered.";
    }
}
