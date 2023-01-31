package factory;

/**
 * A plasic color puzzle by Fisher Price
 * @author Anna PHan
 */
public class PlasticColorPuzzle extends Puzzle {
    /**
     * Creates a new plastic color puzzle
     */
    public PlasticColorPuzzle() {
        name = "Color Puzzle by Melissa and Doug";
        material = "plastic";
        pieces.add("Green Dog");
        pieces.add("Orange Dog");
        pieces.add("Red Dog");
        pieces.add("Blue Dog");
        pieces.add("Yellow Dog");
        pieces.add("Brown Dog");
    }
}
