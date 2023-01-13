package strategy;

/**
 * A Medieval Game Character
 * @author Anna Phan
 * 
 */
public abstract class Character {
    protected String name;
    WeaponBehavior weaponBehavior;

    /**
     * Setting the name of the Character 
     * @param name The name is the of the new Character
     */
    public Character(String name) {
        this.name = name;
    }

    /**
     * Creates a String representation of the character's attacks
     * @return The Character's attack phrase
     */
    public String attack() {
        return weaponBehavior.attack();
    }

    /**
     * Setting the Weapon of the character
     * @param wb The weapons used by the character
     */
    public void setWeaponBehavior(WeaponBehavior wb) {
        weaponBehavior = wb;
    }

    /**
     * Creates a String representation of the Medieval Game Character
     */
    public abstract String toString();
}
