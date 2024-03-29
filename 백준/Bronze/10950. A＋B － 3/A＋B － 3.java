import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append('\n');
        }
        System.out.print(sb);
    }
}