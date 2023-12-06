import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n,m;
    static char[][] arr;
    static boolean[][] visit;
    static int[][] dir ={{1,0},{0,1},{-1,0},{0,-1}};
    static int meet = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new char[n][m];
        visit = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j]= str.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]=='I') dfs(i,j);
            }
        }

        System.out.println(meet==0?"TT":meet);
    }

    private static void dfs(int i, int j) {
        if(arr[i][j]=='P') meet++;
        visit[i][j]=true;

        for (int k = 0; k < 4; k++) {
            int nx = i+dir[k][0];
            int ny = j+dir[k][1];
            if(nx<0||ny<0||nx>=n||ny>=m) continue;
            if(arr[nx][ny]=='X'||visit[nx][ny]) continue;
            dfs(nx,ny);
        }
    }
}
