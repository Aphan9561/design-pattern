package observer;

/**
 * The Observers are the town folk
 * @author Anna Phan
 */
public interface Observer {
    /**
     * Will update the town folk of the trumpet calls
     * @param warning The warning is the number of times the trumpet had been called
     */
    public void update(int warning);
}