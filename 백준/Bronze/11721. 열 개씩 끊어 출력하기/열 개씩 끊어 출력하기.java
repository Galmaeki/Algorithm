import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (count < 10) {
                sb.append(str.charAt(i));
                count++;
            } else {
                sb.append("\n").append(str.charAt(i));
                count = 1;
            }
        }
        System.out.println(sb);
    }
}
