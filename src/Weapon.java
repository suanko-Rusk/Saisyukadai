public abstract class Weapon {
    protected String name;
    private int damage;
    private int cost = 0;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
        this.cost = cost;
    }
    public abstract String attackMessage();


    public int getCost() {
        return this.getCost();
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getDamage() {
        return this.damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
}
