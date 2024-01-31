import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] arr,dir = {{1,0},{0,1},{-1,0},{0,-1}};
    static int size;
    static boolean[][] visit;
    public static void main(String[] args) throws IOException {
        size = Integer.parseInt(br.readLine());
        HashSet<Integer> hs = new HashSet<>();
        int answer = 0,a=0;
        arr= new int[size][size];
        hs.add(0);

        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < size; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                hs.add(arr[i][j]);
            }
        }


        for (Integer h : hs) {
            visit = new boolean[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if(arr[i][j]<=h) continue;
                    if(visit[i][j]) continue;
                    dfs(i,j,h);
                    a++;
                }
            }
            if(a>answer) answer=a;
            a = 0;
        }

        System.out.println(answer);
        
    }

    private static void dfs(int x, int y, int high) {
        visit[x][y]=true;

        for (int i = 0; i < 4; i++) {
            int dx = x+dir[i][0];
            int dy = y+dir[i][1];

            if(dx<0||dy<0||dx>=size||dy>=size) continue;
            if(visit[dx][dy]) continue;
            if(arr[dx][dy]<=high) continue;
            dfs(dx,dy,high);
        }
    }
}