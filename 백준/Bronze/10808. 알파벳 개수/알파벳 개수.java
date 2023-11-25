import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        for (char c : br.readLine().toCharArray()){
            arr[c-'a']++;
        }

        for (int i : arr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}