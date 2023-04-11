package command;
import java.util.HashMap;

/**
 * This handles user input to figure out what to count down from
 * @authors: J TEA : Tessa Neal, Eve Blom, Anna Phan, and Jacqueline Askey
 */
public class InputHandler {
    private HashMap<String, Command> commands;

    /**
     * Creates an input hander for a stopwatch
     * @param watch A stopwatch
     */
    public InputHandler(StopWatch watch) {
        commands = new HashMap<String, Command>();

        Command oneMinCommand = new OneMinCommand(watch);
        commands.put("1", oneMinCommand);
        Command fiveMinCommand = new FiveMinCommand(watch);
        commands.put("5", fiveMinCommand);
        Command thirtySecCommand = new ThirtySecCommand(watch);
        commands.put("30", thirtySecCommand);
    }

    /**
     * Checks whether the data collected from the user can be used. If true, call
     * the apporiate command that it's key matches the data parameters.
     * @param data The data collected from the user in a string form
     * @return A boolean representation of whether the data can be used
     */
    public boolean inputEntered(String data) {
        boolean valid = true;
        if (data.equals("1")) {
            commands.get("1").execute();
        } else if (data.equals("5")) {
            commands.get("5").execute();
        } else if (data.equals("30")) {
            commands.get("30").execute();
        } else {
            valid = false;
        }
        return valid;
    }
}