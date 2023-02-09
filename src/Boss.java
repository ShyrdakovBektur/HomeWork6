public class Boss extends GameEntity {

    private String weapon;

    public Boss(int health, int damage, String weapon) {
        super(health, damage, weapon);
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}



