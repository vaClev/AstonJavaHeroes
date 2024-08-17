import Heroes.Enemy;
import Heroes.Hero;
import Heroes.Mage;
import Heroes.Zombie;

public class BattleGround {
    public static void main(String[] args) {
        Hero hero =new Mage("Gandalf");
        Enemy enemy = new Zombie(100);

        while(enemy.isAlive())
        {
            hero.attackEnemy(enemy);
            System.out.println("enemy hp: "+enemy.getHealth()+"\n");
        }
        System.out.println("Enemy is defeated");

    }
}
