import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            char[] ch = br.readLine().toCharArray();
            int p = 0,tot = 0;
            for (char c : ch) {
                if(c=='O'){
                    p+=1;
                    tot+=p;
                }
                else p = 0;
            }
            sb.append(tot).append("\n");
        }

        System.out.println(sb);
    }
}
