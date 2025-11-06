import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        int max = -100000000, min = 100000000;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < c; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (max < a) max = a;
            if (min > a) min = a;
        }
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}
