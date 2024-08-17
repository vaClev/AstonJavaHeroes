import Heroes.*;

public class TrainingGround {
    public static void main(String[] args) {
        System.out.println("Run Training Ground:\n");
        testBattle();
        System.out.println("Finish Training Ground.\n");
    }

    public static void testBattle() {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Warrior("Aragorn");
        heroes[1] = new Archer("Legalas");
        heroes[2] = new Mage("Gandalf");
        Enemy enemy1 = new Zombie(50);

        showHealthOfHeroes(heroes);
        System.out.println("Enemy:" + enemy1.getHealth() + " hp\n");

        //симуляция 1-го хода
        for(Hero hero: heroes) {hero.attackEnemy(enemy1);}
        enemy1.attackHero(heroes[0]);
        showHealthOfHeroes(heroes);
        System.out.println("Enemy:" + enemy1.getHealth() + " hp\n");

        //симуляция 2-го хода
        for(Hero hero: heroes) {hero.attackEnemy(enemy1);}
        showHealthOfHeroes(heroes);
        System.out.println("Enemy:" + enemy1.getHealth() + " hp\n");
    }

    public static void showHealthOfHeroes(Hero[] heroes) {
        System.out.print("Heroes: ");
        for (Hero hero : heroes) {
            System.out.print(hero.getName() + " " + hero.getHealth() + "hp\t");
        }
        System.out.println();
    }
}