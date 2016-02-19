
import java.util.*;

public class OfficeQuest {

    public static void main(String[] args) {

        String choice;
        int stapleNum = 10;
        double tape = 50.0;
        int paperNum = 0;
        int turnNum = 0;
        boolean keepGoing;
        Stapler S = new Stapler();
        TapeDispenser TD = new TapeDispenser();
        Scanner scan = new Scanner(System.in);

        System.out.println("Office Quest");
        for (int i = 0; i < 24; i++) {
            System.out.println("Turn number: " + turnNum);
            S.setStatus(stapleNum);           
            //System.exit(0);
            TD.setStatus(tape);

            keepGoing = false;
            while (!keepGoing) {
                int status = delivery();
                if (status == -1) {
                    S.addStaple();
                    keepGoing = true;
                } else if (status == 0) {
                    TD.refill();
                    keepGoing = true;
                } else {
                    paperNum = status;
                    boolean valid = false;
                    while (!valid){
                        System.out.print("[T]ape or [S]taple > ");
                        choice = scan.next();
                        if (choice.equalsIgnoreCase("S")){
                            stapleNum = S.staple(paperNum);
                            valid = true;
                            keepGoing = true;
                        }else if (choice.equalsIgnoreCase("T")){
                            tape = TD.tape(paperNum);
                            valid = true;
                            keepGoing = true;
                        }else{
                        	System.out.println("Try again");
                        }                        
                    }                   
                }
            }
            S.check();
            TD.check();
            setTime(i);
            turnNum ++;
        }
		System.out.println("You win the game!");
    }

    public static int delivery() {
        Random r = new Random();
        int temp = r.nextInt(100) + 1;
        if (temp <= 5) {
            System.out.println("The delivery person came by with more staples!");
            return -1;
        } else if (5 < temp && temp <= 10) {
            System.out.println("The delivery person came to refill the tape dispenser!");
            return 0;
        } else {
            int numPaper = r.nextInt(60) + 1;
            System.out.println("The delivery person dropped off " + numPaper + " pages to collate!");
            return numPaper;
        }
    }
    
    public static void setTime(int i){
        int hour, minute;
        int[] a1 = {7,6,5,4,3,2,1};
        int[] a2 = {40, 20, 0};
        
        minute = a2[i%3];
        hour = a1[i/3];
        
        System.out.println(hour + " hour(s) and " + minute +" minutes to go...");
    }
}
