import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                String s = st.nextToken();
                for (int j = s.length(); j > 0; j--) {
                    sb.append(s.charAt(j-1));
                }sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}