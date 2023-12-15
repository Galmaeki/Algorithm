import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static char[][] arr,arrRG;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static boolean visit[][];
    static int set, n;

    public static void main(String[] args) throws IOException {
        set = 0;
        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
        arrRG = new char[n][n];
        visit = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = str.charAt(j);
                if(str.charAt(j)=='G') arrRG[i][j] = 'R';
                else arrRG[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visit[i][j]) continue;
                dfs(i, j,arr);
                set++;
            }
        }
        sb.append(set).append(" ");
        set = 0;
        visit = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visit[i][j]) continue;
                dfs(i, j,arrRG);
                set++;
            }
        }
        sb.append(set);

        System.out.println(sb);
    }

    private static void dfs(int x, int y,char[][] arr) {
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dir[i][0];
            int ny = y + dir[i][1];

            if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
            if (visit[nx][ny]) continue;
            if (arr[x][y] != arr[nx][ny]) continue;
            dfs(nx, ny,arr);
        }
    }
}
