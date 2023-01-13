package strategy;

import java.util.Random;

/**
 * A Medieval Game Weapon that is a Knife
 * @author Anna Phan
 */
public class WeaponKnife implements WeaponBehavior {
    /**
     * Creates a String representation of the using the Knife
     * @return The Character using the Knife
     */
    public String attack() {
        Random r = new Random();
        // A random number will generarate between 1 and 3
        int phrase = r.nextInt((4 - 1)) + 1;
        // a phrase will print out according the to number it generated
        if (phrase == 1) {
            return "Slice with knife";
        } else if (phrase == 2) {
            return "Jab with a knife";
        } else {
            return "Sneak up on opponent with knife";
        }
    }
}
