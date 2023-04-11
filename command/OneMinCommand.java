package command;
/**
 * This counts down from 1 minute until 00:00
 * @authors: J TEA : Tessa Neal, Eve Blom, Anna Phan, and Jacqueline Askey
 */
public class OneMinCommand implements Command {
    private StopWatch stopWatch;

    /**
     * This creates an one minute timer
     */
    public OneMinCommand(StopWatch watch) {
        this.stopWatch = watch;
    }

    /**
     * This executes the command
     */
    public void execute() {
        stopWatch.countDownOneMin();
    }
}
