import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int at = Integer.parseInt(st.nextToken());

            String str = st.nextToken();

            for (int j = 0; j < str.length(); j++) {
                if(at-1==j) continue;
                sb.append(str.charAt(j));
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}