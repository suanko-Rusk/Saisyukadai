public abstract class Character implements Creature {
    private String name;
    private int hp;
    //コンストラクタ
    public Character(String name, int hp) {
        this.name = name;
        this.hp = Math.max(hp,0);
    }
    //生存確認
    public final boolean isAlive() {
        return getHp() > 0;
    }
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
        return hp;
    }
    public void setHp(int i) {
        this.hp = Math.max(hp, 0);
    }
}
