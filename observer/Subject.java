package observer;

/**
 * The Subject os the watchemn that stays in the watch tower
 * @author Anna Phan
 */
public interface Subject {

    /**
     * Will add the town folk that wants to be notified
     * @param observer The observers are the town folk
     */
    public void registerObserver(Observer observer);


    /**
     * Will remove the town folk
     * @param observer The observers are the town folk
     */
    public void removeObserver(Observer observer);

    /**
     * Will notify the townfolk 
     */
    public void notifyObservers();
}
