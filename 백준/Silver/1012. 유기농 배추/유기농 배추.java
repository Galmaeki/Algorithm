import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static boolean[][] arr;
    static boolean visit[][];
    static int w, h, a;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < count; i++) {
            solution();
        }

        System.out.print(sb);
    }

    private static void solution() throws IOException {
        a = 0;

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        w = Integer.parseInt(st1.nextToken());
        h = Integer.parseInt(st1.nextToken());
        int cabbage = Integer.parseInt(st1.nextToken());

        arr = new boolean[w][h];
        visit = new boolean[w][h];

        for (int i = 0; i < cabbage; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = true;
        }

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (visit[i][j]) continue;
                if (!arr[i][j]) continue;
                dfs(i, j);
                a++;
            }
        }

        sb.append(a).append("\n");
    }

    private static void dfs(int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dir[i][0];
            int ny = y + dir[i][1];
            if (nx < 0 || ny < 0 || nx >= w || ny >= h) continue;
            if (!arr[nx][ny] || visit[nx][ny]) continue;
            dfs(nx, ny);
        }
    }
}
