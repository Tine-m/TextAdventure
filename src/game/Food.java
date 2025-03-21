package game;

// game.Food class, which affects player health
class Food extends Item {
    private int healthEffect;

    public Food(String name, int healthEffect) {
        super(name);
        this.healthEffect = healthEffect;
    }

    public int getHealthEffect() {
        return healthEffect;
    }
}