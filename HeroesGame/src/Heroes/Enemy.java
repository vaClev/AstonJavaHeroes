package Heroes;

public abstract class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (health <= 0) {
            this.health = 0;
        }
    }
    public void attackHero(Hero hero) {
        hero.takeDamage(5);
        System.out.println("Enemy attack "+ hero.getName()+" with "+ 5 +" hp!");
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
