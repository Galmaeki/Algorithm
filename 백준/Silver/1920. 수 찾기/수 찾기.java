import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Boolean> hm = new HashMap<>();
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int target = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            hm.put(st1.nextToken(),true);
        }

        for (int i = 0; i < target; i++) {
            sb.append(hm.getOrDefault(st2.nextToken(),false)?"1":"0").append("\n");
        }

        sb.setLength(sb.length()-1);

        System.out.println(sb);
    }
}