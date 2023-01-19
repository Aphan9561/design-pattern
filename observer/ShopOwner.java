package observer;

/**
 * The Shop Owner is an Observer
 * @author Anna Phan
 */
public class ShopOwner implements Observer {
    private int warning;
    private Subject watchman;

    /**
     * Creates a new Shop Owner that will be notified by the watchman
     * @param watchman The watchman will know to notify this observer
     */
    public ShopOwner(Subject watchman) {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    /**
     * Will inform the Shop Owner of how many warnings there have been
     * @param warning The number of warnings there are
     */
    @Override
    public void update(int warning) {
        this.warning = warning;
        if (warning == 1) {
            System.out.println("Shop Owner: Close down shop and head home");
        } else if (warning == 2) {
            System.out.println("Shop Owner: Drops everything and find nearest hideout");
        }
    }
}
