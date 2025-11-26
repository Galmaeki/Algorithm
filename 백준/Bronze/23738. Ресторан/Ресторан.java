import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str =br.readLine();

        for (char c : str.toCharArray()) {
            if(c=='B') sb.append('v');
            else if (c=='E') sb.append("ye");
            else if (c=='H') sb.append("n");
            else if (c=='P') sb.append("r");
            else if (c=='Y') sb.append("u");
            else if (c=='C') sb.append("s");
            else if (c=='X') sb.append("h");
            else sb.append(Character.toLowerCase(c));
        }

        System.out.println(sb);
    }
}