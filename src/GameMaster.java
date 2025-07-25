import character.Hero;
import character.SuperHero;
import character.Thief;
import character.Wizard;
import creature.Character;
import creature.Monster;
import monster.Goblin;
import monster.Matango;
import monster.Slime;
import weapon.Dagger;
import weapon.Sword;
import weapon.Wand;

import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {

        ArrayList<creature.Character> c = new ArrayList<creature.Character>();
        Sword sw = new Sword();
        Wand wa = new Wand();
        Dagger da = new Dagger();
        Hero h =new Hero("勇者", 100, sw);
        Wizard w = new Wizard("魔法使い", 60, 60, wa);
        Thief t = new Thief("盗賊", 70 , da);
        c.add(h);
        c.add(w);
        c.add(t);


        ArrayList<Monster> d = new ArrayList<Monster>();
        Goblin g = new Goblin(50, 'A');
        Matango m = new Matango(45, 'A');
        Slime s = new Slime(40, 'A');
        d.add(g);
        d.add(m);
        d.add(s);

        System.out.println("---味方パーティ---");
        h.showStatus();
        w.showStatus();
        t.showStatus();

        System.out.println("---敵グループ---");
        g.showStatus();
        m.showStatus();
        s.showStatus();

        System.out.println("味方の総攻撃！");
        for(creature.Character i : c) {
            for(Monster j : d) {
                i.attack(j);
            }
        }

        System.out.println("敵の総攻撃！");
        for(Monster j : d) {
            for(creature.Character i : c) {
                j.attack(i);
            }
        }

        System.out.println("ダメージを受けた"+ h.getName() + "が突然光りだした！");
        System.out.println(h.getName() + "はスーパーヒーローになった！");

        SuperHero sh = new SuperHero(h);
        c.set(0,sh);
        for(Monster j : d) {
            sh.attack(j);
        }

        System.out.println("---味方パーティ最終ステータス---");
        for(Character i : c) {
            i.showStatus();
            if (i.isAlive()) {
                System.out.println("生存状況：生存");
            }else {
                System.out.println("生存状況：死亡");
            }
        }

        System.out.println("---敵グループ最終ステータス---");
        for(Monster j : d) {
            j.showStatus();
            if (j.isAlive()) {
                System.out.println("生存状況：生存");
            }else {
                System.out.println("生存状況：討伐済み");
            }
        }


    }
}