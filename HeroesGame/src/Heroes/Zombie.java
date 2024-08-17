package Heroes;

import java.util.Random;

public class Zombie extends Enemy{
    public Zombie(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if(getHealth()==0)
        {
            Random random = new Random();
            if(random.nextInt(5)==0){
                System.out.println("Zombie is resurrected!");
                setHealth(random.nextInt(50)+1);
            }
        }
    }
}
