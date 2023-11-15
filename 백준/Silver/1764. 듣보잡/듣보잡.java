import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> al = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int neverSeen = Integer.parseInt(st.nextToken());
        int neverHeard =Integer.parseInt(st.nextToken());

        for (int i = 0; i < neverSeen; i++) {
            String name = br.readLine();
            hm.put(name,1);
        }

        for (int i = 0; i < neverHeard; i++) {
            String name = br.readLine();
            hm.put(name,hm.getOrDefault(name,0)+1);
        }

        for (String s : hm.keySet()) {
            if(hm.get(s)==2) al.add(s);
        }

        sb.append(al.size()).append("\n");

        Collections.sort(al);

        for (String s : al) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}