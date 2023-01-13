package strategy;

/**
 * A Medieval Game Character that is a Troll 
 * @author Anna Phan
 */

public class Troll extends Character {
    /**
     * Creates a new Troll with the indicated name
     * @param name The name of the Troll
     */
    public Troll(String name) {
        super(name);
        weaponBehavior = new WeaponAxe();
    }

    /**
    * Creates a string representation of the Troll
    * @return A String version of the Troll, letting us know the character is a Troll
    */
    public String toString() {
        return name + " is a funny troll";
    }
}
