package creature;

public abstract class Monster implements Creature {
    private String name;
    private int hp;
    private char suffix;
    //コンストラクタ
    public Monster(String name,int hp, char suffix) {
        this.name = name;
        this.hp = hp;
        this.suffix = suffix;
    }

    public void run() {
        System.out.println(getName() + getSuffix() + "は逃げ出した");
    }
    public void die() {
        System.out.println(getName() + getSuffix() + "を倒した！");
    }
    //生存確認
    public final boolean isAlive(){
        return getHp() > 0;
    }
    //HP,Name確認
    public void showStatus(){
        System.out.println(getName() + " " + getSuffix() + " : HP" + getHp());
    }
    //ゲッター＆セッター
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
        this.hp = Math.max(hp,0);
    }

    public char  getSuffix(){
        return suffix;
    }
    public void setSuffix(char suffix){
        this.suffix = suffix;
    }

}
