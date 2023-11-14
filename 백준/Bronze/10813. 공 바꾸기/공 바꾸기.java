import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i]=i+1;
        }

        for (int i = 0; i < b; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st2.nextToken())-1;
            int y = Integer.parseInt(st2.nextToken())-1;

            int s = arr[x];
            arr[x]= arr[y];
            arr[y]= s;
        }

        Arrays.stream(arr).forEach(v -> sb.append(v).append("\n"));

        System.out.println(sb);
    }
}