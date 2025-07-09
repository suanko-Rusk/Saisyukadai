public interface Creature {
    boolean isAlive();
    void showStatus();
    void attack(Creature target);
    String getName();
    int getHP(int hp);
    void setHp();
}
