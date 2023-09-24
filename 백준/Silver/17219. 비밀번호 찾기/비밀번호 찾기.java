import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,String> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int password = Integer.parseInt(st.nextToken());
        int site = Integer.parseInt(st.nextToken());

        for (int i = 0; i < password; i++) {
            String ps[] = br.readLine().split(" ");

            hm.put(ps[0],ps[1]);
        }

        for (int i = 0; i < site; i++) {
            sb.append(hm.get(br.readLine())).append("\n");
        }

        sb.setLength(sb.length()-1);

        System.out.println(sb);
    }
}