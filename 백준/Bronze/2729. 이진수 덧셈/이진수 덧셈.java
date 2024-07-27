import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            BigInteger bi = new BigInteger(st.nextToken(),2).add(new BigInteger(st.nextToken(),2));
            sb.append(bi.toString(2)).append("\n");
        }

        System.out.println(sb);
    }

}