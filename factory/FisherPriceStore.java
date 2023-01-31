package factory;

/**
 * One of the toy stores named Fisher Price Store
 * @author Anna Phan
 */
public class FisherPriceStore extends ToyStore {

    /**
     * Creates the puzzle
     * @param type The type of puzzle
     */
    public Puzzle createPuzzle(String type) {
        if (type.equals("animal")) {
            return new PlasticAnimalPuzzle();
        } else if (type.equals("color")) {
            return new PlasticColorPuzzle();
        }

        return null;
    }
}
