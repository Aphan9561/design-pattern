package observer;

/**
 * The Teacher is an Observer
 * @author Anna Phan
 */
public class Teacher implements Observer {
    private int warning;
    private Subject watchman;

    /**
     * Creates a new Teacher that will be notified by the watchman
     * @param watchman The watchman will know to notify this observer
     */
    public Teacher(Subject watchman) {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    /**
     * Will inform the Teacher of how many warnings there have been
     * @param warning The number of warnings there are
     */
    @Override
    public void update(int warning) {
        this.warning = warning;
        if (warning == 1) {
            System.out.println("Teacher: Helps get every kid home safe");
        } else if (warning == 2) {
            System.out.println("Teacher: Brings all students to the underground shelter");
        }
    }
}
