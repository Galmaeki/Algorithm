import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st1.nextToken());
        int count = Integer.parseInt(st1.nextToken());

        int[][] arr = new int[size][size];
        int[][] sums = new int[size][size];

        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < size; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

                if (j >= 1) sums[i][j] = sums[i][j - 1] + arr[i][j];
                else sums[i][j] = arr[i][j];
            }
        }

        for (int i = 0; i < count; i++) {
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken())-1;
            int x2 = Integer.parseInt(st.nextToken())-1;
            int y1 = Integer.parseInt(st.nextToken())-1;
            int y2 = Integer.parseInt(st.nextToken())-1;

            for (int j = x1; j <= y1; j++) {
                sum+=sums[j][y2];
                if(x2-1<0) continue;
                sum-=sums[j][x2-1];
            }

            sb.append(sum).append("\n");

        }

        System.out.println(sb);
    }
}