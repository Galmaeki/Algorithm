import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < count; i++) {
            String str = br.readLine();
            hm.put(str.charAt(0),hm.getOrDefault(str.charAt(0),0)+1);
        }

        for (Character c : hm.keySet()) {
            if(hm.get(c)>=5) sb.append(c);
        }

        System.out.println(sb.length()==0?"PREDAJA":sb);
    }
}