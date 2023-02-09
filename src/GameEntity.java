public class GameEntity {
    int health;
    int damage;

    public GameEntity(int helth, int damage, String weapon) {
        this.health = health;
        this.damage = damage;
    }

    public int getHelth() {
        return health;
    }

    public void setHelth(int helth) {
        this.health = helth;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
