package strategy;

import java.util.Random;

/**
 * A Medieval Game Weapon that is an Axe
 * @author Anna Phan
 */
public class WeaponAxe implements WeaponBehavior {
    /**
     * Creates a String representation of the using the Axe
     * @return The Character using the Axe
     */
    public String attack() {
        Random r = new Random();
        // A random number will generarate between 1 and 2
        int phrase = r.nextInt((3 - 1)) + 1;
        // a phrase will print out according the to number it generated
        if (phrase == 1) {
            return "Swing an axe";
        } else {
            return "Twirl with an axe";
        }
    }
}
