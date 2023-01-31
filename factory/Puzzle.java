package factory;

import java.util.ArrayList;

/**
 * Puzzle in store
 * @author Anna Phan
 */
public abstract class Puzzle {
    protected String name;
    protected String material;
    protected ArrayList<String> pieces = new ArrayList<String>();

    /**
     * Assembling the puzzle
     * @return the assembly process
     */
    public String assemble() {
        String result = "";
        result += "Putting together a " + name + "\n";
        result += "This puzzle is made out of " + material + "\n";
        result += "Adding the following pieces\n";

        for (String pieces : pieces) {
            result += pieces + "\n";
        }
        return result;
    }

    /**
     * Putting th epuzzle in a box
     * @return Starting that the puzzle is in a box
     */
    public String boxPuzzle() {
        return "Putting the " + name + " in a box";
    }
}
