import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer>[] arr;
    static boolean visit[];

    public static void main(String[] args) throws IOException {
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int a = 0;
        int v = Integer.parseInt(st1.nextToken());
        int e = Integer.parseInt(st1.nextToken());
        arr = new ArrayList[v + 1];
        visit = new boolean[v + 1];

        for (int i = 0; i <= v; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x].add(y);
            arr[y].add(x);
        }

        for (int i = 1; i <= v; i++) {
            if (visit[i]) continue;
            dfs(i);
            a++;
        }

        System.out.print(a);
    }

    private static void dfs(int x) {
        visit[x] = true;

        for (Integer i : arr[x]) {
            if (visit[i]) continue;
            dfs(i);
        }
    }
}
