public interface Creature {
    boolean isAlive();
    void showStatus();
    abstract void attack(Creature target);
    String getName();
    int getHp();
    void setHp();
}
