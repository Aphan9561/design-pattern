package strategy;

import java.util.Random;

/**
 * A Medieval Game where the character does not have a weapon
 * @author Anna Phan
 */
public class WeaponNone implements WeaponBehavior {
    /**
     * Creates a String representation of the Character not using a weapon
     * @return The Character not having a weapon
     */
    public String attack() {
        Random r = new Random();
        // A random number will generarate between 1 and 2
        int phrase = r.nextInt((3 - 1)) + 1;
        // a phrase will print out according the to number it generated
        if (phrase == 1) {
            return "Oh no! I lost my weapon";
        } else {
            return "No one let's me have a weapon";
        }
    }

}
