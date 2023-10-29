import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    private static boolean solveAnagrams(String first, String second ) {
        /* ------------------- INSERT CODE HERE --------------------
         *
         * Your code should return true if the two strings are anagrams of each other.
         *
         * */
        char[] fC = first.toCharArray();
        char[] sC = second.toCharArray();

        Arrays.sort(fC);
        Arrays.sort(sC);

        if(Arrays.equals(fC,sC))
            return true;
        else
            return false;
        /* -------------------- END OF INSERTION --------------------*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}
