import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] era = new boolean[1001];
        int ans = 0;

        era[0] = true;
        era[1] = true;

        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 2; i * i < 1001; i++) {
            if (era[i]) continue;

            for (int j = i*i; j < 1001; j += i) {
                era[j] = true;
            }
        }

        while (st.hasMoreTokens()){
            int x = Integer.parseInt(st.nextToken());
            if(!era[x]) ans++;
        }

        System.out.println(ans);
    }
}

