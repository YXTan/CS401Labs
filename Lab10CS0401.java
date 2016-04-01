
import java.util.*;

public class Lab10CS0401 {

    public static void main(String[] args) {

        int[][] a1 = {{8, 9, 5, 6, 4, 3},
        {9, 0, 14, 13, 10, 8, 2, 1, 17, 18, 19, 201, 220, 235, 2},
        {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200},
        {22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 1},
        {20, 18, 13, 12, 11, 9, 6, 5, 4, 3, 2, 1, -87, -900, -9, -909, -911, -80, -44, -32, -1000}};

        int[][] a2 = deepCopy(a1);
        System.out.println("Start Bubble Sort! ");
        for (int i = 0; i < a1.length; i++) {
            bubbleSort(a1[i]);
            System.out.println();
        }
        System.out.println("Start Selection Sort! ");
        for (int j = 0; j < a1.length; j++) {
            selectionSort(a1[j]);
        }
    }

    public static void bubbleSort(int[] arr) {
        int swapTime = 0;
        boolean sorted = false;
        while (!sorted) {
            int k1 = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    System.out.println("It swaps position " + i + " and " + (i + 1));
                    printArray(arr);
                    k1++;
                    swapTime ++;
                }else{
                    //do nothing
                }
                if(k1==0){
                    sorted = true;
                }else{
                    sorted = false;
                }
            }
        }
        if (swapTime == 0){
            printArray(arr);
        }
        System.out.println("Swap Time: " + swapTime);
    }

    public static int[][] deepCopy(int[][] arr) {
        int[][] a2 = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            a2[i] = new int[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                a2[i][j] = arr[i][j];
            }
        }
        return a2;
    }

    public static int[][] shallowCopy(int[][] arr) {
        int[][] a2 = null;
        for (int i = 0; i < arr.length; i++) {
            a2[i] = arr[i];
        }
        return a2;
    }

    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int j = 0; j < (arr.length - 1); j++) {
            System.out.print(arr[j] + ", ");
        }
        if (arr.length > 0) {
            System.out.print(arr[arr.length - 1]);
        }
        System.out.println(" ]");

    }

    public static void swap(int[] arr, int index1, int index2) {
        if (index1 == index2) {
            // Do nothing!
        } else {
            int tmp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = tmp;
        }
    }

    public static void selectionSort(int[] arr) {

        if (arr.length < 2) {
            return;
        }
        int minIndex = 0;
        int minVal = 0;
        int swapTime = 0;
        for (int j = 0; j < (arr.length - 1); j++) {
            minIndex = j;
            minVal = arr[j];
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[k] < minVal) {
                    minVal = arr[k];
                    minIndex = k;
                }
            }
            swap(arr, j, minIndex); 
            swapTime++;
        }
        printArray(arr);
        System.out.println("Swap Time: " + swapTime);
    }
}
