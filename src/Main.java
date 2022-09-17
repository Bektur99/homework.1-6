public class Main {
    public static void main(String[] args) {
Boss boss= new Boss();
boss.getWeapon().setWeaponType(WeaponType.FIREARMS);
boss.getWeapon().setWeaponName("AK-47");
boss.setHealth(1000);
boss.setAbility("Firearms");
boss.setProtection("Physical");
        System.out.println(boss.info());
        Skeleton skelet1 = new Skeleton();
        skelet1.setAbility("Magec");
        skelet1.setAttack(32);
        skelet1.setHealth(300);
        System.out.println(skelet1.info());
    }
}