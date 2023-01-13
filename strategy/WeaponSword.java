package strategy;

import java.util.Random;

/**
 * A Medieval Game Weapon that is a Sword
 * @author Anna Phan
 */
public class WeaponSword implements WeaponBehavior {
    /**
     * Creates a String representation of the using the Sword
     * @return The Character using the Sword
     */
    public String attack() {
        Random r = new Random();
        // A random number will generarate between 1 and 3
        int phrase = r.nextInt((4 - 1)) + 1;
        // a phrase will print out according the to number it generated
        if (phrase == 1) {
            return "Lunge and strike with sword";
        } else if (phrase == 2) {
            return "Fancy turn and slice with sword";
        } else {
            return "Jam opponents blade with sword";
        }
    }
}
