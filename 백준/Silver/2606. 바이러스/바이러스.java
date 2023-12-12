import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] al;
    static boolean visit[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer =0;
        int computer = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        visit = new boolean[computer+1];
        al = new ArrayList[computer+1];
        for (int i = 0; i <= computer; i++) {
            al[i]= new ArrayList<>();
        }

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            al[a].add(b);
            al[b].add(a);
        }

        dfs(1);

        for (boolean b : visit) {
            if(b) answer++;
        }

        System.out.print(answer-1);
    }

    private static void dfs(int i) {
        visit[i]=true;
        for (Integer n : al[i]) {
            if(visit[n]) continue;
            dfs(n);
        }
    }
}
