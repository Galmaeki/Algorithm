import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int a= Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
            sb.append("Case ").append(i+1).append(": ").append(b).append("\n");
        }
        System.out.println(sb);
    }

}