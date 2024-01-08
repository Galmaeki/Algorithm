import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, M;
    static int[] arr;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        visit = new boolean[N];

        dfs(0, 0);

        System.out.println(sb);
    }

    private static void dfs(int start, int depth) {
        if (depth == M) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = start; i < N; i++) {
                arr[depth] = i + 1;
                dfs(i + 1, depth + 1);
            }
        }
    }
}