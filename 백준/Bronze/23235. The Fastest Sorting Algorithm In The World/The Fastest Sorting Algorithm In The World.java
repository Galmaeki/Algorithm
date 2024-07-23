import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        int n = 0;
        while (true) {
            String s = br.readLine();
            if (s.charAt(0) == '0')
                break;
            n++;
        }
 
        for (int i = 1; i <= n; i++) {
            sb.append(String.format("Case %d: Sorting... done!\n", i));
        }
        System.out.print(sb);
    }
}