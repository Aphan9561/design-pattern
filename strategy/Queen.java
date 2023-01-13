package strategy;

/**
 * A Medieval Game Character that is a Queen 
 * @author Anna Phan
 */

public class Queen extends Character {
    /**
     * Creates a new Queen with the indicated name
     * @param name The name of the Queen
     */
    public Queen(String name) {
        super(name);
        weaponBehavior = new WeaponKnife();
    }

    /**
    * Creates a string representation of the Queen
    * @return A String version of the Queen, letting us know the character is a Queen
    */
    public String toString() {
        return name + " is a beautiful Queen";
    }
}
