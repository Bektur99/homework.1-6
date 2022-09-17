public class Main {
    public static void main(String[] args) {
Boss boss= new Boss();
boss.getWeapon().setWeaponType(WeaponType.FIREARMS);
boss.getWeapon().setWeaponName("AK-47");
boss.setHealth(1000);
boss.setAbility("Firearms");
boss.setProtection("Physical");
        System.out.println(boss.info());
            System.out.println("----------------------------------------------");
        Skeleton skelet1 = new Skeleton();
        Skeleton skelet2 =new Skeleton();
        skelet1.getWeapon().setWeaponType(WeaponType.FIREARMS);
        skelet1.setAbility("Firearms");
        skelet1.setAttack(32);
        skelet1.setHealth(300);
        skelet1.setStrela(143);
        skelet2.getWeapon().setWeaponType(WeaponType.FIREARMS);
        skelet2.setAbility("Firearms");
        skelet2.setAttack(43);
        skelet2.setHealth(287);
        skelet2.setStrela(212);

        System.out.println(skelet1.info());
        System.out.println("-----------------------------------------------");
        System.out.println(skelet2.info());



    }
}