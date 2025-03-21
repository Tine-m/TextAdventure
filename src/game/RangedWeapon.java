package game;

// RangedWeapon class - has limited uses
class RangedWeapon extends Weapon {
    private int ammo;

    public RangedWeapon(String name, int damage, int ammo) {
        super(name, damage);
        this.ammo = ammo;
    }

}