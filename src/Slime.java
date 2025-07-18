public class Slime extends Monster {
    public Slime(int hp, char suffix) {
        super("スライム",hp, suffix);
    }
    public final void attack(Creature target) {
        System.out.println("お化けキノコ" + getSuffix() + "は体当たり攻撃！" + target.getName() + "に6のダメージを与えた！");
        target.setHp(target.getHp() - 5);
    }
}
