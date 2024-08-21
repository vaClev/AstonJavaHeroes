package Heroes;

public class Archer extends Hero{
    public Archer(String name) {
        super(name);
        setMaxDamage(10);
        setHealth(70);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer "+getName()+" attack enemy with "+ getMaxDamage()+" hp!");
        enemy.takeDamage(getMaxDamage());
    }
}
