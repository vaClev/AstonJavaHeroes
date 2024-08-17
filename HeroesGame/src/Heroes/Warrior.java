package Heroes;

public class Warrior extends Hero{
    public Warrior(String name) {
        super(name);
        setMaxDamage(8);
        setHealth(100);
    }
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer "+getName()+" attack enemy with "+ getMaxDamage()+" hp!");
        enemy.takeDamage(getMaxDamage());
    }
}
