
import java.io.*;
import java.util.*;

/*

 NoogieException (required)
 CoogieException (required)

 */
public class Lab12CS401 {

    public static void main(String[] args) {

        //ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            arr[6] = 1;
        } catch (ArrayIndexOutOfBoundsException aex) {
            System.out.println(aex.toString());
        }

        //NullPointerException
        try {
            Integer i = null;
            int j = i.intValue();
        } catch (NullPointerException nex) {
            System.out.println(nex.toString());
        }

        //ClassCastException
        try {
            Object i = Integer.valueOf(22);
            String s = (String) i;
        } catch (ClassCastException cex) {
            System.out.println(cex.toString());
        }

        //ArithmeticException
        try {
            int i = 1, j = 0;
            System.out.println(i / j);
        } catch (ArithmeticException aex) {
            System.out.println(aex.toString());
        }

        //NegativeArraySizeException
        try {
            int[] arr = new int[-1];
        } catch (NegativeArraySizeException nex) {
            System.out.println(nex.toString());
        }

        //StringIndexOutOfBoundsException
        try {
            String str = "String Index OutOfBoundsException";
            char c = str.charAt(50);
        } catch (StringIndexOutOfBoundsException sex) {
            System.out.println(sex.toString());
        }

        //NumberFormatException
        try {
            String str = "hellohello";
            int i = Integer.parseInt(str);
            System.out.println(i);
        } catch (NumberFormatException nex) {
            System.out.println(nex.toString());
        }

        //ArrayStoreException
        try {
            Object[] i = new Integer[5];
            i[3] = 4.0;
        } catch (ArrayStoreException aex) {
            System.out.println(aex.toString());
        }

        //FileNotFoundException
        try {
            File file = new File("file2.txt");
            Scanner scanFile = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }

        //NoSuchElementException
        try {
            File file = new File("file.txt");
            Scanner scanFile = new Scanner(file);
            System.out.println(scanFile.nextLine());
        } catch (NoSuchElementException nex) {
            System.out.println(nex.toString());
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }

        //IOException
//        try {
//            File file = new File("src/voters.txt");
//            Scanner scanFile = new Scanner(file);
//            System.out.println(scanFile.nextLine());
//        } catch (IOException ex) {
//            System.out.println(ex.toString());
//        }

        //noogieException
        try {
            throw (new NoogieException());
        } catch (NoogieException ex) {
            System.out.println(ex.toString());
        }
        
        try {
            throw (new CoogieException(2));
        } catch (CoogieException ex) {
            System.out.println(ex.toString());
        }
    }
}
