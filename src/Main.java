public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss(450,85,"РПД 44 СХ");
        boss1.health = 450;
        boss1.damage = 85;
        boss1.setWeapon("РПД 44 СХ");
        System.out.println("Boss:"+ " | "+boss1.health +" | "+ boss1.damage+" | "+boss1.getWeapon() );




    }
}