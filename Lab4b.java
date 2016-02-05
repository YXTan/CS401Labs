
import java.util.Scanner;

public class Lab4b {

    public static void main(String[] args) {
        int choice;
        System.out.println("5. Self-actualization (achieving your total potential)\n"
                + "4. Esteem (e.g., respect from others, self-respect)\n"
                + "3. Love and Belonging (e.g., friendship and family)\n"
                + "2. Safety (e.g., personal and financial security)\n"
                + "1. Physiological (e.g., oxygen, food, water)");
        System.out.println();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Level > ");
        choice = scan.nextInt();
        
        switch (choice){
            case 5:
                System.out.println("Self-actualization");
            case 4:
                System.out.println("Esteem");
            case 3:
                System.out.println("Love and belonging");
            case 2:
                System.out.println("Safety");
            case 1:
                System.out.println("Physiological");
                break;
            default:
                System.out.println("Enter the righ number");
        }
    }
}
