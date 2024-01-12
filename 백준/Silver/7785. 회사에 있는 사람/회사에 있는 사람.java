import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        HashMap<String, Boolean> hm = new HashMap<>();
        ArrayList<String> al = new ArrayList<>();
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String[] str = br.readLine().split(" ");
            if("enter".equals(str[1])) hm.put(str[0],true);
            else hm.remove(str[0]);
        }

        for (String s : hm.keySet()) {
            al.add(s);
        }

        Collections.sort(al, Comparator.reverseOrder());

        for (String s : al) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}