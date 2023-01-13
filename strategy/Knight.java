package strategy;

/**
 * A Medieval Game Character that is a Knight 
 * @author Anna Phan
 */

public class Knight extends Character {
    /**
     * Creates a new Knight with the indicated name
     * @param name The name of the Knight
     */
    public Knight(String name) {
        super(name);
        weaponBehavior = new WeaponBow();
    }

    /**
    * Creates a string representation of the Knight
    * @return A String version of the Knight, letting us know the character is a Knight
    */
    public String toString() {
        return name + " is a valiant knight";
    }
}
