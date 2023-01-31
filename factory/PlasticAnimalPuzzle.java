package factory;

/**
 * A plastic animal puzzle by Fisher Price
 * @author Anna Phan
 */
public class PlasticAnimalPuzzle extends Puzzle {
    /**
     * Creates a new plastic animal puzzle
     */
    public PlasticAnimalPuzzle() {
        name = "Animal Puzzle by Fisher Price";
        material = "plastic";
        pieces.add("Fox");
        pieces.add("Elephant");
        pieces.add("Giraffe");
        pieces.add("Owl");
        pieces.add("Monkey");
    }
}
