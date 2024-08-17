package Heroes;

public class Mage extends Hero{
    public Mage(String name) {
        super(name);
        setMaxDamage(13);
        setHealth(60);
    }
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer "+getName()+" attack enemy with "+ getMaxDamage()+" hp!");
        enemy.takeDamage(getMaxDamage());
    }
}
