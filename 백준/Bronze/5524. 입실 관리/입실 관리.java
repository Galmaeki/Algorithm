import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            sb.append(br.readLine().toLowerCase()).append("\n");
        }

        System.out.println(sb);
    }
}