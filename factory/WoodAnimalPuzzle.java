package factory;

/**
 * A wood animal puzzle by Melissa and Doug
 * @author Anna Phan
 */
public class WoodAnimalPuzzle extends Puzzle {
    /**
     * Creates a new wood animal puzzle
     */
    public WoodAnimalPuzzle() {
        name = "Animal Puzzle by Melissa and Doug";
        material = "wood";
        pieces.add("Horse");
        pieces.add("Sheep");
        pieces.add("Dog");
        pieces.add("Cat");
        pieces.add("Cow");
        pieces.add("Chicken");
    }
}
