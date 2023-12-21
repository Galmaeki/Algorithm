import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int a = Integer.parseInt(br.readLine());
            for (int j = 0; j < a; j++) {
                sb.append("=");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}