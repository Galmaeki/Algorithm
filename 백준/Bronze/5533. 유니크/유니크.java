import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());

        ArrayList<String[]> al = new ArrayList<>();
        HashMap<String, Integer> g1 = new HashMap<>();
        HashMap<String, Integer> g2 = new HashMap<>();
        HashMap<String, Integer> g3 = new HashMap<>();
        for (int i = 0; i < count; i++) {
            String[] line = br.readLine().split(" ");
            al.add(line);

            g1.put(line[0],g1.getOrDefault(line[0],0)+1);
            g2.put(line[1],g2.getOrDefault(line[1],0)+1);
            g3.put(line[2],g3.getOrDefault(line[2],0)+1);
        }

        for (String[] line : al) {
            int score = 0;
            if(g1.get(line[0]) == 1) score+=Integer.parseInt(line[0]);
            if(g2.get(line[1]) == 1) score+=Integer.parseInt(line[1]);
            if(g3.get(line[2]) == 1) score+=Integer.parseInt(line[2]);

            sb.append(score).append("\n");
        }

        System.out.println(sb);
    }
}