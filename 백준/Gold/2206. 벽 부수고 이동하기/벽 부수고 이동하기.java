import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int col;
    static int row;
    static boolean[][] map;
    static boolean[][][] visit;
    static int[][] adj = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Node> qu = new ArrayDeque<>();
        int count = -1;

        StringTokenizer st = new StringTokenizer(br.readLine());

        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());

        map = new boolean[col][row];
        visit = new boolean[col][row][2];

        for (int i = 0; i < col; i++) {
            String str = br.readLine();

            for (int j = 0; j < row; j++) {
                if (str.charAt(j) == '1') {
                    map[i][j] = true;
                }
            }
        }

        qu.add(new Node(0, 0, 1, false));
        visit[0][0][0] = true;

        while (!qu.isEmpty()) {
            Node node = qu.poll();
            int crashed = node.crash?1:0;

            if (node.x == col - 1 && node.y == row - 1) {
                count = node.c;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int x = node.x + adj[i][0];
                int y = node.y + adj[i][1];

                if (x >= col || y >= row || x < 0 || y < 0) continue;
                if (!map[x][y]) {
                    if(!visit[x][y][crashed]){
                        qu.add(new Node(x, y, node.c + 1, node.crash));
                        visit[x][y][crashed] = true;
                    }
                }
                if (!node.crash) {
                    if(!visit[x][y][1]){
                        qu.add(new Node(x, y, node.c + 1, true));
                        visit[x][y][1] = true;
                    }
                }
            }
        }

        System.out.println(count);
    }

    static class Node {
        int x;
        int y;
        int c;
        boolean crash;

        Node(int x, int y, int c, boolean b) {
            this.x = x;
            this.y = y;
            this.c = c;
            crash = b;
        }
    }
}
