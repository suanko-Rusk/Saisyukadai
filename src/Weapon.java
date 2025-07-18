public abstract class Weapon {
    protected String name;
    private int damage;
    private int cost ;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
        this.cost = 0;
    }
    public abstract String attackMessage();
}
