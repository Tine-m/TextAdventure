package game;

// Abstract game.Weapon class with damage attribute
abstract class Weapon extends Item implements Combat{
    protected int damage;

    public Weapon(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}