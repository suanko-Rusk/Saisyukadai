package character;

import creature.Character;
import creature.Creature;
import weapon.Weapon;

public class Thief extends Character {
    private boolean guard;
    public Thief(String name, int hp , Weapon weapon) {
        super(name, hp ,weapon);
    }
    public void attack(Creature target) {
        System.out.println(getName() + "は素早く２回攻撃した！" + getName()+ getWeapon().attackMessage() + target.getName() + "に" + getWeapon().getDamage() + "のダメージを与えた！");
        target.setHp(target.getHp() - getWeapon().getDamage()*2);
    }
    public void guard() {
        guard = true;
    }
    public void setHp(int damage) {
        if (guard) {
           guard = false;
           System.out.println("しかし、"+ getName() + "は、攻撃を回避し、ダメージが入らなかった！");
        } else {
            super.setHp(damage);
        }
    }
}
