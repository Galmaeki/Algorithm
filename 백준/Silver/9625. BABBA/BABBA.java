import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        long[][] arr = new long[46][2];

        arr[0][0] = 0;//B
        arr[0][1] = 1;//A

        for (int i = 1; i <= 45; i++) {
            arr[i][0] = arr[i-1][1]+arr[i-1][0];//A는 B로 바뀜//
            arr[i][1] = arr[i-1][0];//A는 B만큼 생김
        }

        int a = Integer.parseInt(br.readLine());
        sb.append(arr[a][1]).append(" ").append(arr[a][0]);

        System.out.print(sb);
    }
}
