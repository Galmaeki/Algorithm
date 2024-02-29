import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static char[][] arr;
    static boolean[][] visit;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static int n, m, sheep, wolf, staticSheep, staticWolf;

    public static void main(String[] args) throws IOException {
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st1.nextToken());
        m = Integer.parseInt(st1.nextToken());
        arr = new char[n][m];
        visit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == '#') continue;
                if (visit[i][j]) continue;
                wolvesCanEatSheep(i, j);

                if (staticSheep > staticWolf) staticWolf = 0;
                else staticSheep = 0;

                sheep += staticSheep;
                wolf += staticWolf;

                staticSheep = 0;
                staticWolf = 0;
            }
        }

        System.out.println(sheep + " " + wolf);
    }

    private static void wolvesCanEatSheep(int x, int y) {
        visit[x][y] = true;
        if (arr[x][y] == 'o') staticSheep++;
        if (arr[x][y] == 'v') staticWolf++;

        for (int i = 0; i < 4; i++) {
            int dx = x + dir[i][0];
            int dy = y + dir[i][1];

            if (dx < 0 || dy < 0 || dx >= n || dy >= m) continue;
            if (arr[dx][dy] == '#') continue;
            if (visit[dx][dy]) continue;
            wolvesCanEatSheep(dx, dy);
        }
    }
}