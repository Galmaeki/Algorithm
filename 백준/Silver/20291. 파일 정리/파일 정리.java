import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> hm = new HashMap<>();
        ArrayList<String> al = new ArrayList<>();

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] s = br.readLine().split("\\.");
            hm.put(s[1],hm.getOrDefault(s[1],0)+1);
        }

        for (String s : hm.keySet()) {
            al.add(s);
        }

        Collections.sort(al);

        for (String s : al) {
            sb.append(s).append(" ").append(hm.get(s)).append("\n");
        }

        System.out.println(sb);
    }
}