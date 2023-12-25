import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line).append("\n");
        }

        System.out.println(sb);
    }
}