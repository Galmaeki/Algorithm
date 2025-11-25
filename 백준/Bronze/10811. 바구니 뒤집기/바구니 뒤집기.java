import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }

        for (int p = 0; p < m; p++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st1.nextToken()) - 1;
            int e = Integer.parseInt(st1.nextToken()) - 1;
            if (s == e) continue;

            for (int i = 0; i < (e - s + 1) / 2; i++) {
                int tmp = arr[s + i];
                arr[s + i] = arr[e - i];
                arr[e - i] = tmp;
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
            ;
        }

        System.out.println();
    }
}