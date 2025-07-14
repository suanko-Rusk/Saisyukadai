public class Goblin extends Monster {
    public Goblin(String name,int hp, char suffix) {
        super(name,hp, suffix);
    }
    public void attack(Creature target) {
        System.out.println("ゴブリン" + getSuffix() + "はナイフで切りつけた！" + target.getName() + "に8のダメージを与えた！");
        target.setHp(target.getHp() - 8);
    }
}
