import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken()+st.nextToken());
        long b = Long.parseLong(st.nextToken()+st.nextToken());

        sb.append(a+b);

        System.out.println(sb);
    }
}