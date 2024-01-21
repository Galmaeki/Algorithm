import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        HashMap<String,Boolean> hm = new HashMap<>();
        int a =0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        for (int i = 0; i < first; i++) {
            hm.put(br.readLine(),Boolean.TRUE);
        }

        for (int i = 0; i < second; i++) {
            String str = br.readLine();
            if(hm.getOrDefault(str,Boolean.FALSE)) a++;
        }

        System.out.print(a);
    }
}