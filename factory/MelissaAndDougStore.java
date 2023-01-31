package factory;

/**
 * A toy store named Melissa nd Doug
 * @author Anna Phan
 */
public class MelissaAndDougStore extends ToyStore {

    /**
     * Creates the puzzle
     * @param type The type of puzzle
     */
    public Puzzle createPuzzle(String type) {
        if (type.equals("animal")) {
            return new WoodAnimalPuzzle();
        } else if (type.equals("color")) {
            return new WoodColorPuzzle();
        }
        return null;
    }
}
