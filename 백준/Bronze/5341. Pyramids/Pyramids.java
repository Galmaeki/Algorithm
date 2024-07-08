import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        while (true) {
            long n = Long.parseLong(br.readLine());
            if (n == 0) break;
            sb.append(n*(n+1)/2).append('\n');
        }
        System.out.print(sb);
    }
}