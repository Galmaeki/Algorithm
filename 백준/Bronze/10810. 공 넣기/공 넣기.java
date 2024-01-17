import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int basket = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        int arr[] = new int[basket];

        for (int i = 0; i < count; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st1.nextToken())-1;
            int end = Integer.parseInt(st1.nextToken())-1;
            int ball = Integer.parseInt(st1.nextToken());

            for (int j = start; j <=end ; j++) {
                arr[j]=ball;
            }
        }

        for (int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}