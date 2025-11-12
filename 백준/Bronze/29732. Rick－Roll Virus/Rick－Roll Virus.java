import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int cure = Integer.parseInt(st.nextToken());
        int range = Integer.parseInt(st.nextToken());

        char[] s = br.readLine().toCharArray();
        char[]ss = new char[n];

        for (int i = 0; i < n; i++) {
            if (s[i] == 'R') {
                ss[i] = 'R';
                for (int j = 0; j < (Math.max(1, range)); j++) {
                    int front = i - j-1, back = i + j+1;
                    if (front >= 0 ) ss[front] = 'R';
                    if(back < n) ss[back] = 'R';
                }
            }
        }

        for (char c : ss) {
            if(c=='R') cure--;
        }

        System.out.println(cure<0 ? "No" : "Yes");
    }
}
