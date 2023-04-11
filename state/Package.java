package state;

/**
 * Package status
 * @author Anna Phan
 */
public class Package {
    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State InTransitState;
    private State deliveredState;

    /**
     * Creates a new package
     * @param name     name of package
     * @param quantity how many packages
     */
    public Package(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;

        orderedState = new OrderedState(this, quantity);
        InTransitState = new InTransitState(this, quantity);
        deliveredState = new DeliveredState(this, quantity);
    }

    /**
     * Ordering the package
     * @return the status and ETA of package
     */
    public String order() {
        setState(orderedState);
        String result = state.getStatus();
        result += "\n" + state.getETA();
        return result;
    }

    /**
     * package is in transit
     * @return the status and ETA of package
     */
    public String mail() {
        setState(InTransitState);
        String result = state.getStatus();
        result += "\n" + state.getETA();
        return result;
    }

    /**
     * package delivered
     * @return status of delivery
     */
    public String received() {
        setState(deliveredState);
        return state.getStatus();
    }

    /**
     * delaying the package
     * @return delay package
     */
    public String delay() {
        return state.delay();
    }

    /**
     * Set which state the package is in
     * @param state the state of the package
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Gets the name of the package
     * @return the name of the package
     */
    public String getName() {
        return name;
    }
}
