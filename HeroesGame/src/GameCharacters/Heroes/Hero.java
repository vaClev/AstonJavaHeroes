package Heroes;

public abstract class Hero implements Mortal{
    private final String name;
    private int maxDamage;
    private int health;

    public Hero(String name) {
        this.name = name;
    }
    public abstract void attackEnemy(Enemy enemy);
    public void takeDamage(int damage) {
        this.health -= damage;
        if (health <= 0) {
            this.health = 0;
        }
    }
    public String getName() {
        return name;
    }
    public int getMaxDamage() {
        return maxDamage;
    }
    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }
    public int getHealth() {
        return health;
    }
    protected void setHealth(int health) {
        this.health = health;
    }
    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
