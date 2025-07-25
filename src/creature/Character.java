package creature;
import weapon.Weapon;

public abstract class Character implements Creature {
    private String name;
    private int hp;
    private Weapon weapon;
    //コンストラクタ
    public Character(String name, int hp, Weapon weapon) {
        this.name = name;
        //this.hp = Math.max(hp,0);
        this.hp = hp;
        this.weapon = weapon;

    }
    //生存確認
    public final boolean isAlive() {
        return getHp() > 0;
    }
    public void die() { System.out.println(getName() +"は死んでしまった！"); }
    //HP,Name確認
    public void showStatus() {
        System.out.println(getName() + ": HP" + getHp());
    }
    //ゲッター＆セッター
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp() {
        return this.hp;
    }
    public void setHp(int i) {
        this.hp = i;
    }
    public Weapon getWeapon() {
        return weapon;
    }
}
