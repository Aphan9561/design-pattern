package strategy;

/**
 * A Medieval Game Character that is a King
 * @author Anna Phan
 */

public class King extends Character {
    /**
     * Creates a new King with the indicated name
     * @param name The name of the King
     */
    public King(String name) {
        super(name);
        weaponBehavior = new WeaponSword();
    }

    /**
     * Creates a string representation of the King
     * @return A String version of the King, letting us know the character is a King
     */
    public String toString() {
        return name + " is a Noble King";
    }
}
