import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static boolean[][] arr,visit;
    static int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
    static int sX, sY;
    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            solution();
        }

        System.out.println(sb);
    }

    private static void solution() throws IOException {
        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        sX = Integer.parseInt(st.nextToken());
        sY = Integer.parseInt(st.nextToken());

        arr = new boolean[sX][sY];
        visit = new boolean[sX][sY];

        for (int i = 0; i < sX; i++) {
            String str = br.readLine();
            for (int j = 0; j < sY; j++) {
                if(str.charAt(j)=='#') arr[i][j]=true;
            }
        }

        for (int i = 0; i < sX; i++) {
            for (int j = 0; j < sY; j++) {
                if(arr[i][j]&&!visit[i][j]){
                    dfs(i,j);
                    answer++;
                }
            }
        }

        sb.append(answer).append("\n");
    }

    private static void dfs(int x, int y) {
        visit[x][y]=true;

        for (int i = 0; i < 4; i++) {
            int dx = x+dir[i][0];
            int dy = y+dir[i][1];

            if(dx<0||dy<0||dx>=sX||dy>=sY) continue;
            if(visit[dx][dy]||!arr[dx][dy])continue;
            dfs(dx,dy);
        }
    }
}