public class Boss extends GameEntity {

 Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public  String info() {
        return  "Boss  Health: "+ getHealth() + ", Boss Weapon Type: " + getWeapon().getWeaponType() +
                ", Boss Weapon Name: " + getWeapon().getWeaponName() +
                ", Boss Ability: " + getAbility() + ", Boss Protection: " + getProtection();
    }
}
