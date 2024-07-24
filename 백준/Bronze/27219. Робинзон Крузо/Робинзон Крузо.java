import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n /5 ; i++) {
            sb.append("V");
        }

        for(int i = 0; i < n % 5; i++) {
            sb.append("I");
        }

        System.out.println(sb);
    }
}