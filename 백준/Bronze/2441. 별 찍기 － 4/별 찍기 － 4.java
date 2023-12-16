import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if(i<=j) sb.append("*");
                else sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
