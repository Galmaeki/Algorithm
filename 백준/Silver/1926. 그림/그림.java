import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n,m,d;
    static boolean[][] arr;
    static boolean[][] visit;
    static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    public static void main(String[] args) throws IOException {
        int manyPictures = 0;
        int biggestPicture = 0;
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st1.nextToken());
        m = Integer.parseInt(st1.nextToken());
        arr=new boolean[n][m];
        visit=new boolean[n][m];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                if("1".equals(st.nextToken())) arr[i][j]=true;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!arr[i][j]||visit[i][j]) continue;
                manyPictures++;
                d=0;
                dfs(i,j);
                if(d>biggestPicture) biggestPicture=d;
            }
        }
        sb.append(manyPictures).append("\n").append(biggestPicture);

        System.out.println(sb);
    }

    private static void dfs(int x,int y) {
        visit[x][y]=true;
        d++;

        for (int i = 0; i < 4; i++) {
            int dx = x+dir[i][0];
            int dy = y+dir[i][1];
            if(dx<0||dy<0||dx>=n||dy>=m) continue;
            if(!arr[dx][dy]||visit[dx][dy]) continue;
            dfs(dx,dy);
        }
    }
}