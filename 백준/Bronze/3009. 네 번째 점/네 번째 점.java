import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> hma = new HashMap<>();
        HashMap<String,Integer> hmb = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            hma.put(a, hma.getOrDefault(a,0)+1);
            hmb.put(b, hmb.getOrDefault(b,0)+1);
        }

        for (String s : hma.keySet()) {
            if(hma.get(s)==1) sb.append(s);
        }

        sb.append(" ");

        for (String s : hmb.keySet()) {
            if(hmb.get(s)==1) sb.append(s);
        }

        System.out.print(sb);
    }
}