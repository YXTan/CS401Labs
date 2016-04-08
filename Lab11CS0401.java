
import java.util.Random;
import java.util.Scanner;

public class Lab11CS0401 {

    public static void main(String[] args) {

        System.out.println("Welcome to the Summuner Rift!");
        System.out.print("Are you ready to go? (1 for yes and 0 for no) > ");
        Scanner scan = new Scanner(System.in);
        int temp = scan.nextInt();
        scan.nextLine();
        if (temp == 0) {
            System.out.println("Thank you for playing!");
            System.exit(0);
        }
        System.out.println("Let us go!");

        Player player = new Player();
        Hoard hoard = new Hoard();
        boolean end = false;

        while (!end) {
            Random random = new Random();
            int monsterType = random.nextInt(10);
            Monster m = new Monster();
            if (monsterType >= 0 && monsterType <= 4) {
                m = new Goblin();
                System.out.println("You encounter a Goblin!");
            } else if (monsterType >= 5 && monsterType <= 8) {
                m = new Troll();
                System.out.println("You encounter a Troll!");
            } else if (monsterType == 9 || monsterType == 10) {
                m = new Dragon();
                System.out.println("You encounter a Dragon!");
            }
            boolean defeat = false;
            boolean run = false;
            while (!defeat && !run) {
                System.out.println("HP " + player.getHP() + " MP " + player.getMP());
                System.out.println("Monster HP: " + m._hp);
                System.out.println("(A)ttack");
                System.out.println("(B)erserk");
                System.out.println("(M)agic");
                System.out.println("(R)un away");
                System.out.print("Your choice: ");
                String choice = scan.nextLine();
                if (choice.equalsIgnoreCase("A")) {
                    player.attack(m);
                } else if (choice.equalsIgnoreCase("R")) {
                    player.run(m);
                    run = true;
                } else if (choice.equalsIgnoreCase("B")) {
                    player.berserk(m);
                } else if (choice.equalsIgnoreCase("M")) {
                    player.magic(m);
                }

                int hp = player.getHP();
                if (hp <= 0) {
                    System.out.println("You have been vanquished by the " + m.getName());
                    end = true;
                }

                defeat = m.getStatus();
                if (defeat == true) {
                    System.out.println("You have defeated the " + m.getName() + "!");
                    hoard.defeatResult(m);
                    if (m.getName().equals("Dragon")) {
                        end = true;
                        Goblin g = new Goblin();
                        Troll t = new Troll();
                        Dragon d = new Dragon();
                        System.out.println("Number goblins defeated: " + g._defeatTime);
                        System.out.println("Number trolls defeated: " + t._defeatTime);
                        System.out.println("Number dragons defeated: " + d._defeatTime);
                        hoard.getTotal();
                    }
                } else {
                    //do nothing
                }
            }

        }

    }
}
