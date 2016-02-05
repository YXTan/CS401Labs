
import java.util.Scanner;

public class Lab4a {

    public static void main(String[] args) {
        String name;
        int choice = 0;
        int people = 0;
        int utils = 0;
        int totalUtils = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name > ");
        name = scan.nextLine();

        while (choice != 4) {
            System.out.println("(1) - Buy people ice cream");
            System.out.println("(2) - Steal ice cream from people");
            System.out.println("(3) - Dream about people eating ice cream");
            System.out.println("(4) - Die");
            System.out.print("Enter next action of " + name + " >");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("How many people?");
                    people = scan.nextInt();
                    utils = people * 3;
                    System.out.println("This action caused " + utils + " utils of happiness.");
                    totalUtils += utils;
                    break;
                case 2:
                    System.out.println("How many people?");
                    people = scan.nextInt();
                    utils = people * -5;
                    System.out.println("This action caused " + utils + " utils of happiness.");
                    totalUtils += utils;
                    break;
                case 3:
                    System.out.println("How many people?");
                    people = scan.nextInt();
                    utils = people * 0;
                    System.out.println("This action caused " + utils + " utils of happiness.");
                    totalUtils += utils;
                    break;
                case 4:
                    System.out.println(name + " caused " + totalUtils + " utils of happiness."); 
                    if (totalUtils > 0){
                        System.out.println("This was a morally good life.");
                    }else if (totalUtils < 0){
                        System.out.println("This was a morally evil life.");
                    }else{
                        System.out.println("This was a morally neutral life");
                        break;
                    }
            }
        }

    }
}
