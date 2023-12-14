import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        for (char c : br.readLine().toCharArray()) {
            if(c>='A'&&c<='M') sb.append((char)(c+13));
            else if(c>'M'&&c<='Z') sb.append((char)(c-13));
            else if(c>='a'&&c<='m') sb.append((char)(c+13));
            else if(c>'m'&&c<='z') sb.append((char)(c-13));
            else sb.append(c);
        }
        System.out.print(sb);
    }
}
