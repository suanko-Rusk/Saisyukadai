package character;

import creature.Character;
import creature.Creature;
import  weapon.Weapon;

public class Hero extends Character {
    public Hero(String name, int hp, Weapon weapon) {
        super(name, hp,weapon) ;
    }
    public void attack(Creature target){
        System.out.println( getName() + "は" + getWeapon().getName() + "で攻撃！" + getWeapon().getName() +getWeapon().attackMessage()+ target.getName() + "に10のダメージを与えた！");
        target.setHp(target.getHp() - getWeapon().getDamage());
    }
}
