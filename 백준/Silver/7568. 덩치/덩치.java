import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int[][] arr = new int[count][3];

        for (int i = 0; i < count; i++) {
            StringTokenizer st =new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = 1;
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if(i==j) continue;

                if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]) arr[i][2]++;
            }
        }

        for (int i = 0; i < count; i++) {
            sb.append(arr[i][2]).append(" ");
        }

        System.out.println(sb);
    }
}