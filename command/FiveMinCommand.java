package command;

/**
 * This counts down from 5 minutes until 00:00
 * @authors: J TEA : Tessa Neal, Eve Blom, Anna Phan, and Jacqueline Askey
 */
public class FiveMinCommand implements Command {
    private StopWatch stopWatch;

    /**
     * This creates a five minute timer
     */
    public FiveMinCommand(StopWatch watch) {
        this.stopWatch = watch;
    }

    /**
     * This executes the command
     */
    public void execute() {
        stopWatch.countDownFiveMin();
    }
}
