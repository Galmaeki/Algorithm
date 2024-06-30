import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Integer count = Integer.parseInt(br.readLine());
        int[][] arr = new int[count][3];
        int r = 0, g = 1, b = 2;

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][r] = Integer.parseInt(st.nextToken());
            arr[i][g] = Integer.parseInt(st.nextToken());
            arr[i][b] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < count; i++) {
            arr[i][r] += Math.min(arr[i - 1][g], arr[i - 1][b]);
            arr[i][g] += Math.min(arr[i - 1][r], arr[i - 1][b]);
            arr[i][b] += Math.min(arr[i - 1][g], arr[i - 1][r]);
        }

        int a = 20000000;

        for (int i = 0; i < 3; i++) {
            if (arr[count - 1][i] < a) {
                a = arr[count - 1][i];
            }
        }

        System.out.println(a);
    }
}