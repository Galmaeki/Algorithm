import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int r = 31;
        int m = 1234567891;
        long sum = 0;
        long mod = 1;
        char[] arr = br.readLine().toCharArray();

        for (char c : arr) {

            sum += (((c - 'a') + 1) * mod);
            mod = (r * mod) % m;
        }

        System.out.println(sum % m);
    }
}