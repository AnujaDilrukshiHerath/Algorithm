
/**
 *  The <tt>ThreeSum</tt> class provides static methods for counting
 *  and printing the number of triples in an array of integers that sum to 0
 *  (ignoring integer overflow).
 *
 *  IDE specific configuration setting to input the data:
 *
 *  For Eclipse: Select "Run configurations..." from the drop-down menu "Run", click on tab "(x)=Arguments" and
 *  (a) type in the name of the file, e.g., 1Kints.txt, into the text field "Program arguments:",
 *  (b) select the working directory at the bottom where the file resides
 *
 *  For NetBeans: Right mouse click on the application main folder, select the option
 *  "Set Configuration" and "Customize..." from the drop-down menu. Subsequently, type in and select
 *  the file name and the working directory, respectively.
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ThreeSum {

    /**
     * Prints to standard output the (i, j, k) with i < j < k such that a[i] + a[j] + a[k] == 0.
     * @param a the array of integers
     */

    public static void printAll(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }
        }
    }

    /**
     * Returns the number of triples (i, j, k) with i < j < k such that a[i] + a[j] + a[k] == 0.
     * @param a the array of integers
     * @return the number of triples (i, j, k) with i < j < k such that a[i] + a[j] + a[k] == 0
     */

    public static int count(int[] a) {

        int N = a.length;
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int[] readAllInts(Scanner s){
        ArrayList<Integer> intList = new ArrayList<>();
        while(s.hasNextInt())
            intList.add(s.nextInt());
        int numInts = intList.size();
        int[] a = new int[numInts];
        for(int i=0; i<numInts; i++)
            a[i] = intList.get(i);
        return a;
    }

    /**
     * Reads in a sequence of integers from a file, specified as a command-line argument;
     * counts the number of triples sum to exactly zero; prints out the time to perform
     * the computation.
     */
    public static void main(String[] args)  {
        Scanner input = null;
        try {
            input = new Scanner(new File(args[0]));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int[] a = readAllInts(input);

        long start = System.currentTimeMillis();
        int cnt = count(a);
        long now = System.currentTimeMillis();
        double elapsed = (now - start) / 1000.0;
        System.out.println(cnt);
        System.out.println();
        System.out.println("Elapsed time = " + elapsed + " seconds");
    }
}
