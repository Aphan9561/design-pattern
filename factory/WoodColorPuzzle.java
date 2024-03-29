package factory;

/**
 * A wood color puzzle by Melissa and Doug
 * @author Anna Phan
 */
public class WoodColorPuzzle extends Puzzle {
    /**
     * Creates a new wood color puzzle
     */
    public WoodColorPuzzle() {
        name = "Color Puzzle by Melissa and Doug";
        material = "wood";
        pieces.add("Red Fish");
        pieces.add("Yellow Fish");
        pieces.add("Green Fish");
        pieces.add("Purple Fish");
        pieces.add("Pink Fish");
        pieces.add("Orange Fish");
        pieces.add("Brown Fish");
        pieces.add("White Fish");
        pieces.add("Black Fish");
    }
}
