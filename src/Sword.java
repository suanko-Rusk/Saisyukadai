public class Sword extends Weapon{
    public Sword(String name, int damage) {
        super("剣", 10);
    }
    public String attackMessage() {
        return getName() + "で切りつけた！";
    }
}
