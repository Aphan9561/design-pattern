package strategy;

import java.util.Random;

/**
 * A Medieval Game Weapon that is a Bow
 * @author Anna Phan
 */
public class WeaponBow implements WeaponBehavior {
    /**
     * Creates a String representation of the using the Bow
     * @return The Character using the Bow
     */
    public String attack() {
        Random r = new Random();
        // A random number will generarate between 1 and 2
        int phrase = r.nextInt((3 - 1)) + 1;
        // a phrase will print out according the to number it generated
        if (phrase == 1) {
            return "Draw and loose an arrow";
        } else {
            return "Shoot arrow high in the sky";
        }
    }

}
