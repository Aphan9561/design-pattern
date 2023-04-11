package command;
/**
 * This counts down from 30 seconds until 00:00
 * 
 * @authors: J TEA : Tessa Neal, Eve Blom, Anna Phan, and Jacqueline Askey
 */
public class ThirtySecCommand implements Command {
    private StopWatch stopwatch;

    /**
     * This creates a thirty second timer
     */
    public ThirtySecCommand(StopWatch watch) {
        this.stopwatch = watch;
    }

    /**
     * This executes the countdown from 30 seconds
     */
    public void execute() {
        stopwatch.countDownThirtySec();
    }
}
