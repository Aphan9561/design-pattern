package factory;

/**
 * Toy Store
 * @author Anna Phan
 */
public abstract class ToyStore {

    /**
     * Creates a new puzzle
     * @return the pzzle type
     */
    public abstract Puzzle createPuzzle(String type);

    /**
     * Ordering the puzzle
     * @param type The type of puzzle
     * @return The assembly process of the puzzle
     */
    public String orderPuzzle(String type) {
        Puzzle puzzle = createPuzzle(type);

        return puzzle.assemble() + puzzle.boxPuzzle();

    }
}
