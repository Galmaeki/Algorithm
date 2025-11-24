import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] era = new boolean[10001];
        boolean flag = false;
        int t = 0;

        era[0] = true;
        era[1] = true;

        int ta = Integer.parseInt(br.readLine());
        int tb = Integer.parseInt(br.readLine());

        for (int i = 2; i * i < 10001; i++) {
            if (era[i]) continue;

            for (int j = i*i; j < 10001; j += i) {
                era[j] = true;
            }
        }

        for (int i = ta; i <= tb; i++) {
            if (!era[i]) {
                flag = true;
                t = i;
                break;
            }
        }


        if(!flag) System.out.println(-1);
        else {


            long ans = 0;

            for (int i = ta; i <= tb; i++) {
                if (!era[i]) {
                    ans+=i;
                }
            }
            System.out.println(ans);
            System.out.println(t);
        }
    }
}