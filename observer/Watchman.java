package observer;

import java.util.ArrayList;

/**
 * Watchman is the subject
 * @author Anna Phan
 */
public class Watchman implements Subject {
    private ArrayList<Observer> observers;
    private int warning;

    /**
     * Creates a new Watchman
     */
    public Watchman() {
        observers = new ArrayList<Observer>();
    }

    /**
     * Will add the town folk that wants to be notified by the Watchman
     * @param observer The observers are the town folk
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Will remove the town folk that does not want to be notified by the Watchman
     * @param observer The observers are the town folk
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Watchman will notify the town folk on the number of warnings
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(warning);
        }
    }

    /**
     * Will print out the warning according to the number of warning and notify the town folk
     * @param warning The warning will print out the phrase 
     */
    public void issueWarning(int warning) {
        this.warning = warning;
        if (warning == 1) {
            System.out.println("WARNING:  1 trumpet was played!");
        } else if (warning == 2) {
            System.out.println("WARNING:  2 trumpets were played!");
        }
        notifyObservers();
    }
}
