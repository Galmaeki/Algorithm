import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            sb.append("Case #").append(i+1).append(": ");

            String[] words = br.readLine().split(" ");
            String[] fixWords = new String[words.length];

            for (int j = 0; j < words.length; j++) {
                fixWords[j] = words[words.length-1-j];
            }

            for (String fixWord : fixWords) {
                sb.append(fixWord).append(" ");
            }

            sb.deleteCharAt(sb.length()-1).append("\n");
        }

        System.out.println(sb);
    }
}