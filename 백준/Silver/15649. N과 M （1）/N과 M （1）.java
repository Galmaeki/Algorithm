import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int arr[];
    static boolean used[];
    static int N, M;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M + 1];
        used = new boolean[N + 1];

        recursion(1);

        System.out.println(sb);
    }

    public static void recursion(int n) {
        if (n == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = 1; i <= N; i++) {
                if (used[i]) continue;

                arr[n] = i;
                used[i] = true;

                recursion(n + 1);
                arr[n] = 0;
                used[i] = false;
            }
        }
    }
}