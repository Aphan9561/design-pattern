package strategy;

public abstract class Character {
    protected String name;
    WeaponBehavior weaponBehavior;

    public Character (String name) {
        this.name = name;
    }

    public String attack() {
        return weaponBehavior.attack();
    }

    public void setWeaponBehavior(WeaponBehavior wb) {
        weaponBehavior = wb;
    }

    public abstract String toString();
}
