import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        for (int i = count; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}