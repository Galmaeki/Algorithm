import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};
    static int w, h, a;
    static boolean[][] arr, visit;

    public static void main(String[] args) throws IOException {
        String line;
        while (!"0 0".equals(line = br.readLine())) {
            a = 0;
            StringTokenizer st = new StringTokenizer(line);
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            arr = new boolean[h][w];
            visit = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    if ("1".equals(st1.nextToken())) arr[i][j] = true;
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if(visit[i][j]) continue;
                    if (arr[i][j]) {
                        dfs(i, j);
                        a++;
                    }
                }
            }
            sb.append(a).append("\n");
        }

        System.out.print(sb);
    }

    static void dfs(int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < 8; i++) {
            int nx = x + dir[i][0];
            int ny = y + dir[i][1];

            if (nx < 0 || ny < 0 || nx >= h || ny >= w) continue;
            if (visit[nx][ny]) continue;
            if (!arr[nx][ny]) continue;
            dfs(nx, ny);
        }
    }
}
