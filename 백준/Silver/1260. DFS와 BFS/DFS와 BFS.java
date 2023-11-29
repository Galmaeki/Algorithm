import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    // 1260번 - DFS와 BFS
    static StringBuilder sb = new StringBuilder();
    static int n, m, v;
    static int[][] adj;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());// 정점의 개수
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        adj = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st1.nextToken());
            int y = Integer.parseInt(st1.nextToken());
            adj[x][y] = 1;
            adj[y][x] = 1;
        }

        visit = new boolean[n + 1];
        dfs(v);
        sb.append("\n");
        for (int i = 0; i <= n; i++) visit[i] = false;
        bfs(v);

        System.out.println(sb);
    }

    private static void dfs(int x) {
        visit[x] = true;// X를 방문함
        sb.append(x).append(" ");
        for (int y = 1; y <= n; y++) {
            if (adj[x][y] == 0) continue;// 간선 없음
            if (visit[y]) continue;// 이미 방문함
            dfs(y);
        }
    }

    private static void bfs(int x) {
        Queue<Integer> que = new LinkedList<>();

        que.add(x);
        visit[x] = true;// x에 방문함

        while (!que.isEmpty()) {// 큐가 빌때까지 반복
            x = que.poll();// 반복문에 들어와서 x를 제거
            sb.append(x).append(" ");
            for (int y = 1; y <= n; y++) {
                if (adj[x][y] == 0) continue;// 간선 없음
                if (visit[y]) continue;// 이미 방문함

                que.add(y);// 방문한 적 없는 정점을 큐에 추가
                visit[y] = true;
            }
        }
    }
}
