import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][] move = {{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {-2, 1}, {-1, 2}, {1, 2}, {2, 1}};

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            Queue<Node> q = new ArrayDeque<>();
            int size = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringTokenizer ed = new StringTokenizer(br.readLine());

            boolean[][] board = new boolean[size][size];
            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());
            int ex = Integer.parseInt(ed.nextToken());
            int ey = Integer.parseInt(ed.nextToken());

            q.add(new Node(sx,sy,0));
            board[sx][sy] = true;

            while (!q.isEmpty()){
                Node n = q.poll();

                if(n.x==ex&&n.y==ey){
                    sb.append(n.t).append("\n");
                    break;
                }

                for (int j = 0; j < 8; j++) {
                    int nx = n.x + move[j][0];
                    int ny = n.y + move[j][1];

                    if(nx<0||ny<0||nx>=size||ny>=size) continue;
                    if(board[nx][ny]) continue;
                    board[nx][ny] = true;
                    q.add(new Node(nx,ny,n.t+1));
                }
            }
        }

        System.out.println(sb);
    }

    static class Node {
        int x;
        int y;
        int t;

        public Node(int x, int y, int t) {
            this.x = x;
            this.y = y;
            this.t = t;
        }
    }
}
