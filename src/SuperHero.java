public class SuperHero extends Hero {
    public SuperHero(Hero human) {
        super(human.getName(),human.getHp(),human.getWeapon());
    }
    public void attack(Creature target){
        System.out.println(getName() + "は" + getWeapon() + "で攻撃！" + target.getName() + "に25のダメージを与えた！");
        target.setHp(target.getHp() - 25);
    }
}
