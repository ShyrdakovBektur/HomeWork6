public class Weapon {
    private String weaponType;
    private String weaponName;

    public Weapon(String weaponTupe, String weaponName) {
        this.weaponType = weaponTupe;
        this.weaponName = weaponName;
    }

    public String getWeaponTupe() {
        return weaponType;
    }

    public void setWeaponTupe(String weaponTupe) {
        this.weaponType = weaponTupe;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
