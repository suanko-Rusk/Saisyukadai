import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        Hero hero = new Hero("勇者", 100, "剣");
        SuperHero superHero = new SuperHero(hero);
        Wizard wiz = new Wizard("魔法使い", 60, 60);
        Thief th = new Thief("盗賊", 70);

        ArrayList<Character> x = new ArrayList<Character>();

    }
}