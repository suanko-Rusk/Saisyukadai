package character;

import creature.Character;
import creature.Creature;
import weapon.Weapon;
public class Wizard extends Character {
    private int mp;
    public Wizard(String name, int hp, int mp, Weapon weapon) {
        super(name, hp, weapon);
        this.mp = mp;
    }
    public void magic(Creature target) {
        if (getMp() <= 0) {
            System.out.println("MPが足りない！");
            return;
        }
        System.out.println(getName() + "は火の玉を唱えた！" + getWeapon().getName()+ getWeapon().attackMessage()+ target.getName() + "に" + getWeapon().getDamage() + "のダメージを与えた！");
        target.setHp(target.getHp() - getWeapon().getDamage());
        setMp(getMp() - getWeapon().getCost());
    }
    public void attack(Creature target) {
        System.out.println(getName() + "は石を投げた！" + target.getName() + "に3のダメージを与えた！");
        target.setHp(target.getHp() - 3);
    }
    public void showStatus() {
        System.out.println(getName() + ": HP" + getHp()+ "/MP" + getMp());
    }
    public int getMp() {
        return mp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }
}
