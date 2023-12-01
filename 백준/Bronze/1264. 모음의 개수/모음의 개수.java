import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (!(line = br.readLine()).equals("#")) {
            int a = 0;
            for (char c : line.toLowerCase().toCharArray()) {
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') a++;
            }
            sb.append(a).append("\n");
        }
        System.out.print(sb);
    }
}
