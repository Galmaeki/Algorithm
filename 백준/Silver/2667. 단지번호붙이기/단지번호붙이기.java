import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[][] arr;
    static boolean[][] visit;
    static int[][] dir ={{1,0},{0,1},{-1,0},{0,-1}};
    static ArrayList<Integer> al;
    static int set;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        al = new ArrayList<>();
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visit  = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String st = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = st.charAt(j)-'0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j] && arr[i][j] == 1) {
                    set = 0;
                    dfs(i, j);
                    al.add(set);
                }
            }
        }


        Collections.sort(al);

        sb.append(al.size()).append("\n");
        al.stream().forEach(v->sb.append(v).append("\n"));
        System.out.println(sb);
    }

    private static void dfs(int x, int y) {
        set++;
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x+dir[i][0];
            int ny = y+dir[i][1];
            if(nx<0||ny<0||nx>=N||ny>=N) continue;
            if(arr[nx][ny]==0||visit[nx][ny]) continue;
            dfs(nx,ny);
        }
    }
}
