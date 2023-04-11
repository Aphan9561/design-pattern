package command;
/**
 * This counts down from a certain times, 1 min, 5 min, or 30 sec, until 00:00
 * @author: J TEA : Tessa Neal, Eve Blom, Anna Phan, and Jacqueline Askey
 */
import java.util.concurrent.TimeUnit;

public class StopWatch {

    /**
     * This creates the stop watch
     * @return The stopwatch
     */
    public StopWatch() {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * This counts down one minute, sixty seconds, until 00:00
     */
    public void countDownOneMin() {
        for (int i = 59; i >= 0; i--) {
            if (i < 10) {
                System.out.println("00:0" + i);
            } else {
                System.out.println("00:" + i);
            }
            if (i != 0) {
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                clear();
            }
        }
    }

    /**
     * This counts down five minute, one hundred twenty seconds, until 00:00
     */
    public void countDownFiveMin()
    {
        for(int i = 4; i >= 0; i--) {
            for(int j = 59; j >= 0; j--) {
                if ((i < 10) && (j < 10)) {
                    System.out.println("0" + i+":0" + j);
                } else if (((i > 10) && (j < 10))){
                    System.out.println(i + ":0" + j);
                } else if (((i < 10) && (j > 10))){
                    System.out.println("0" + i + ":" + j);
                } else{
                    System.out.println(i + ":" + j);
                }
                if((i != 0) || (j != 0)){
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    clear();
                }
            }
        }
    }

    /**
     * This counts down thirty seconds, until 00:00
     */
    public void countDownThirtySec() {
        for (int i = 29; i >= 0; i--) {
            if (i < 10) {
                System.out.println("00:0" + i);
            } else {
                System.out.println("00:" + i);
            }

            if (i != 0) {
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                clear();
            }
        }
    }

    /**
     * This method can be use to clear the console between each down count so one
     * time is seen.
     */
    private void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
