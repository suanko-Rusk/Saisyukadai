import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        Hero h = new Hero("勇者", 100, "剣");
        Wizard w = new Wizard("魔法使い", 60, 60);
        Thief t = new Thief("盗賊", 70);
        ArrayList<Character> c = new ArrayList<Character>();
        c.add(new Hero("勇者", 100, "剣"));
        c.add(new Wizard("魔法使い", 60, 60));
        c.add(new Thief("盗賊", 70));

        Goblin g = new Goblin(50, 'A');
        Matango m = new Matango(45, 'A');
        Slime s = new Slime(40, 'A');
        ArrayList<Monster> d = new ArrayList<Monster>();
        d.add(new Goblin(50, 'A'));
        d.add(new Matango(45, 'A'));
        d.add(new Slime(40, 'A'));

        System.out.println("---味方パーティ---");
        h.showStatus();
        w.showStatus();
        t.showStatus();

        System.out.println("---敵グループ---");
        g.showStatus();
        m.showStatus();
        s.showStatus();

        System.out.println("味方の総攻撃！");
        for(Character i : c){
            for(Monster j : d){
                i.attack(j);
            }
        }
    }
}