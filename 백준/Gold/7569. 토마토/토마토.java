import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][][] arr;
    static boolean[][][] visit;
    static Queue<Node> bfsQ = new LinkedList<>();
//    static Queue<Node> unRotten = new LinkedList<>();
    static int[] dirX = {1, -1, 0, 0, 0, 0};
    static int[] dirY = {0, 0, 1, -1, 0, 0};
    static int[] dirZ = {0, 0, 0, 0, 1, -1};
    static Integer w;
    static Integer d;
    static Integer h;

    public static void main(String[] args) throws IOException {
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        w = Integer.parseInt(st1.nextToken());
        h = Integer.parseInt(st1.nextToken());
        d = Integer.parseInt(st1.nextToken());

        arr = new int[w][h][d];
        visit = new boolean[w][h][d];

        int rotten = 0;
        int unrotten = 0;
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < h; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0; k < w; k++) {
                    Integer n = Integer.parseInt(st.nextToken());
                    arr[k][j][i] = n;

                    if (n == 1) {
                        bfsQ.add(new Node(k, j, i, 0));
                        visit[k][j][i] = true;
                    }
                    if(n==0){
                        unrotten++;
                    }
                }
            }
        }

        if(unrotten==0){
            System.out.println(0);
            return;
        }

        int max = 0;
        while (!bfsQ.isEmpty()) {
            Node node = bfsQ.poll();
            if (max < node.c) {
                max = node.c;
            }

            for (int i = 0; i < 6; i++) {
                int dx = node.x+dirX[i];
                int dy = node.y+dirY[i];
                int dz = node.z+dirZ[i];

                if (!checkDir(dx, dy, dz)) {
                    if (arr[dx][dy][dz] != -1) {
                        if (!visit[dx][dy][dz]) {
                            visit[dx][dy][dz] = true;
                            arr[dx][dy][dz] = 1;
                            bfsQ.add(new Node(dx, dy, dz, node.c + 1));
                            rotten++;
                        }
                    }
                }
            }
        }

        if(rotten!=unrotten){
            System.out.println(-1);
            return;
        }
        System.out.println(max==0?-1:max);
    }

    private static boolean checkDir(int dx, int dy, int dz) {
        return dx < 0 || dy < 0 || dz < 0 || dx >= w || dy >= h || dz >= d;
    }

    static class Node {

        int x;
        int y;
        int z;
        int c;

        Node(int x, int y, int z, int c) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.c = c;
        }
    }
}