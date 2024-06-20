import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Integer i = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int j = 0; j < i; j++) {
            String s = st.nextToken();
            hm.put(s,hm.getOrDefault(s,0)+1 );
        }

        System.out.println(hm.getOrDefault(br.readLine(),0));
    }
}