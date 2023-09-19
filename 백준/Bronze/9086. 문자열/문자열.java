import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        String st;

        for (int i = 0; i < count; i++) {
            st = br.readLine();
            sb.append(st.charAt(0)).append(st.charAt(st.length()-1)).append("\n");
        }

        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}