import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            al.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(al);

        for (Integer i : al) {
            sb.append(i).append(" ");
        }
        
        System.out.print(sb);
    }
}
