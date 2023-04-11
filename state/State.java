package state;

/**
 * State of the package
 * @author Anna Phan
 */
public abstract class State {
    protected Package pkg;
    protected int quantity;
    /**
     * Creates a new state
     * @param pkg package name 
     * @param quantity how many there is 
     */
    public State(Package pkg, int quantity) {
        this.pkg = pkg;
        this.quantity = quantity;
    }
    
    public abstract String getStatus();

    public abstract String getETA();

    public abstract String delay();
    /**
     * Puts the correct verb for the package
     * @param singular has/is
     * @param plural have/are
     * @return the approprate verb for the package/packages
     */
    protected String getVerb(String singular, String plural) {
        if (quantity == 1) {
            return singular;
        } 
        return plural;
    }
}
