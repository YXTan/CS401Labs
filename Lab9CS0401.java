/*
    Lab9 CS0401 Yongxin Tan
 */
import java.util.Scanner;

public class Lab9CS0401 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        World world = new World();
        Scientists sci = new Scientists(world);
        boolean stop = false;
        int[] output;
        int colorNum;
        String colorName;
        int moveNum =0;
        
        while (!stop){
            boolean valid = false;
            while (!valid){
                System.out.print("Enter dimension to travel (1,2,3,4,5) (-1 to quit) > ");
                if (scan.hasNextInt()){
                    int dimension = scan.nextInt();
                    if (dimension >= 1 && dimension <= 5){
                        System.out.print("Enter units to travel (negative for backwards) > ");
                        if (scan.hasNextInt()){
                            int temp = scan.nextInt();
                            if (temp >= 0){
                                moveNum = temp % 10;
                            }else if (temp < 0){
                                moveNum = 10 + temp % 10;
                            }
                            output = sci.move(dimension, moveNum);
                            colorNum = output[5];
                            colorName = world.getColor(colorNum);
                            System.out.print("Location: [ ");
                            for (int i=0; i<5; i++){
                                System.out.print(output[i]+" ");
                            }
                            System.out.print("] = " + colorName);
                            System.out.println();
                            valid = true;
                        }  
                    } else if (dimension == -1){
                        valid = true;
                        stop = true;
                        System.out.println("The scientist gives up on the quest for understanding.");
                    } else {
                        System.out.println("Try again!");
                        valid = false;
                    }
                }else{
                    scan.next();
                }
            }//check whether the input is valid
            
        }
    }
}
