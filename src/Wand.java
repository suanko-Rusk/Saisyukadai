public class Wand extends Weapon {
    public Wand(String name, int damage) {
        super("魔法の杖", 15);
        this.setCost(5);
    }
    public String attackMessage() {
        return getName() + "から魔法を放った！";
    }
}
