import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int x;
    static int y;
    static int sx, sy;
    static int[][] arr;
    static boolean[][] visit;
    static int[][] adj = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer xy = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Node> qu = new ArrayDeque<>();

        x = Integer.parseInt(xy.nextToken());
        y = Integer.parseInt(xy.nextToken());

        arr = new int[x][y];
        visit = new boolean[x][y];

        for (int i = 0; i < x; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < y; j++) {
                int n = Integer.parseInt(st.nextToken());

                if (n == 0) visit[i][j] = true;
                if (n == 2) {
                    visit[i][j] = true;
                    sx = i;
                    sy = j;
                }
            }
        }

        qu.add(new Node(sx, sy, 0));

        while (!qu.isEmpty()) {
            Node n = qu.poll();

            for (int i = 0; i < 4; i++) {
                int nx = n.x + adj[i][0];
                int ny = n.y + adj[i][1];

                if (nx >= x || ny >= y || nx < 0 || ny < 0) continue;
                if (visit[nx][ny]) continue;
                qu.add(new Node(nx, ny, n.c + 1));
                visit[nx][ny] = true;
                arr[nx][ny] = n.c + 1;
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(!visit[i][j]) arr[i][j] = -1;
            }
        }

        for (int[] arrs : arr) {
            for (int i : arrs) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    static class Node {
        int x;
        int y;
        int c;

        Node(int x, int y, int c) {
            this.x = x;
            this.y = y;
            this.c = c;
        }
    }
}