//Lab7 CS0401 Yongxin Tan

import java.io.*;
import java.util.Scanner;

public class Lab7CS0401 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        int arrayLength;
        char[] world = new char[1];

        boolean valid = false;
        while (!valid) {
            System.out.print("How big of the world > ");
            if (scan.hasNextInt()) {
                arrayLength = scan.nextInt();
                world = generateUniverse(arrayLength);
                valid = true;
            } else {
                System.out.println("Try again");
                scan.next();
            }
        }

        for (int i = 0; i < world.length; i++) {
            if (i > 0 && i % 5 == 0 && i % 7 != 0) {
                world[i] = '^';
            } else if (i % 7 == 0) {
                world[i] = '0';
            } else {
                world[i] = '.';
            }
        }
        printArray(world);

        boolean stop = false;
        while (!stop) {
            System.out.print("What to do now? Q)uit, (A)dvance or (S)ave ");
            String choice = scan.next();
            if (choice.equalsIgnoreCase("Q")) {
                System.exit(0);
            } else if (choice.equalsIgnoreCase("A")) {
                stop = false;
                for (int i = 0; i < world.length; i++) {
                    if (world[i] == '0') {
                        world[i] = '1';
                    } else if (world[i] == '1') {
                        world[i] = '2';
                    } else if (world[i] == '2' && i == world.length - 1) {
                        world[i] = '2';
                    } else if (world[i] == '2' && world[i + 1] == '2') {
                        world[i] = '2';
                        world[i + 1] = '2';
                    } else if (world[i] == '2' && world[i + 1] == '.') {
                        world[i] = '.';
                        world[i + 1] = '2';
                        i++;
                    } else if (world[i] == '2' && world[i + 1] == '^') {
                        world[i] = '.';
                        world[i + 1] = '0';
                        i++;
                    }
                    //System.out.println(i);
                }
                printArray(world);
            } else if (choice.equalsIgnoreCase("S")) {
                int baby=0, child=0, adult=0;
                
                for (int j=0; j<world.length; j++){
                    if (world[j] == '0'){
                        baby++;
                    }else if (world[j] == '1'){
                        child++;
                    }else if (world[j] == '2'){
                        adult++;
                    }
                }
                
                PrintWriter output = new PrintWriter("universe.txt");
                output.println(world);
                output.println("Babies: " + baby);
                output.println("Children: " + child);
                output.println("Adults: " + adult);
                output.close();
            }
        }

    }

    public static void printArray(char[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }

    public static char[] generateUniverse(int size) {
        char[] temp = new char[size];
        return temp;
    }
}
