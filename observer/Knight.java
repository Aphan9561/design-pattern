package observer;

/**
 * The Knight is an Observer
 * @author Anna Phan
 */
public class Knight implements Observer {
    private int warning;
    private Subject watchman;

    /**
     * Creates a new Knight that will be notified by the watchman
     * @param watchman The watchman will know to notify this observer
     */
    public Knight(Subject watchman) {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    /**
     * Will inform the Knight of how many warnings there have been
     * @param warning The number of warnings there are
     */
    @Override
    public void update(int warning) {
        this.warning = warning;
        if (warning == 1) {
            System.out.println("Knight: Helps everyone get home safe");
        } else if (warning == 2) {
            System.out.println("Knight: Prepares for battle");
        }
    }
}
