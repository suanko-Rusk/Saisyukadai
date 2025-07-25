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

        ArrayList<creature.Character> characters = new ArrayList<creature.Character>();
        Sword sw = new Sword();
        Wand wa = new Wand();
        Dagger da = new Dagger();
        Hero h =new Hero("勇者", 100, sw);
        Wizard w = new Wizard("魔法使い", 60, 60, wa);
        Thief t = new Thief("盗賊", 70 , da);
        characters.add(h);
        characters.add(w);
        characters.add(t);


        ArrayList<Monster> monsters = new ArrayList<Monster>();
        //Goblin g = new Goblin(50, 'A');
        //Matango m = new Matango(45, 'A');
        //Slime s = new Slime(40, 'A');
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < 5; i++) {
            int choice = new java.util.Random().nextInt(3) + 1;
            switch (choice) {
                case 1:
                    monsters.add(new Goblin(50, (char) ('A' + a)));
                    a++;
                    break;
                case 2:
                    monsters.add(new Matango(45, (char) ('A' + b)));
                    b++;
                    break;
                case 3:
                    monsters.add(new Slime(40, (char) ('A' + c)));
                    c++;
                    break;
            }
        }

        System.out.println("---味方パーティ---");
        for (creature.Character j : characters) {
            j.showStatus();
        }

        System.out.println("---敵グループ---");
        for (Monster j : monsters) {
            j.showStatus();
        }



        System.out.println("味方の総攻撃！");
        for(creature.Character i : characters) {
            for(Monster j : monsters) {
                i.attack(j);
            }
        }

        System.out.println("敵の総攻撃！");
        for(Monster j : monsters) {
            for(creature.Character i : characters) {
                j.attack(i);
            }
        }

        System.out.println("ダメージを受けた"+ h.getName() + "が突然光りだした！");
        System.out.println(h.getName() + "はスーパーヒーローになった！");

        SuperHero sh = new SuperHero(h);
        characters.set(0,sh);
        for(Monster j : monsters) {
            sh.attack(j);
        }

        System.out.println("---味方パーティ最終ステータス---");
        for(Character i : characters) {
            i.showStatus();
            if (i.isAlive()) {
                System.out.println("生存状況：生存");
            }else {
                System.out.println("生存状況：死亡");
            }
        }

        System.out.println("---敵グループ最終ステータス---");
        for(Monster j : monsters) {
            j.showStatus();
            if (j.isAlive()) {
                System.out.println("生存状況：生存");
            }else {
                System.out.println("生存状況：討伐済み");
            }
        }


    }
}