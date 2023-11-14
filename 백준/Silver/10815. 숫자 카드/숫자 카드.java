import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Boolean> hm = new HashMap<>();

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < a; i++) {
            hm.put(st.nextToken(),true);
        }

        int b = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < b; i++) {
            sb.append(hm.getOrDefault(st1.nextToken(),false)?"1":"0").append(" ");
        }

        System.out.println(sb);
    }
}