import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int col;
    static int row;
    static int[][] box;
    static boolean[][] visit;
    static int[][] adj = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Node> qu = new LinkedList<>();
        int day = 0;
        boolean flag = false;

        StringTokenizer cr = new StringTokenizer(br.readLine());

        col = Integer.parseInt(cr.nextToken());
        row = Integer.parseInt(cr.nextToken());
        box = new int[row][col];
        visit = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < col; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == -1) visit[i][j] = true;
                if (box[i][j] == 1) {
                    visit[i][j] = true;
                    qu.add(new Node(i, j, 0));
                }
            }
        }

        while (!qu.isEmpty()) {
            Node node = qu.poll();
            for (int i = 0; i < 4; i++) {
                int x = node.x + adj[i][0];
                int y = node.y + adj[i][1];

                if (x < 0 || y < 0 || x >= row || y >= col) continue;
                if (visit[x][y]) continue;
                visit[x][y] = true;
                qu.add(new Node(x, y, node.day + 1));
            }

            if (day < node.day) day = node.day;
        }


        for (boolean[] bs : visit) {
            for (boolean b : bs) {
                if (!b) {
                    flag = true;
                    break;
                }
            }
        }

        if(!flag) System.out.println(day);
        else System.out.println(-1);
    }

    static class Node {
        int x;
        int y;
        int day;

        Node(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
}
