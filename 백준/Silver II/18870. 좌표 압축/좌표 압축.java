import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
            hs.add(a);
        }

        ArrayList<Integer> al = new ArrayList<>();
        hs.stream().forEach(v -> al.add(v));

        Collections.sort(al);

        for (int i = 0; i < al.size(); i++) {
            hm.put(al.get(i), i);
        }

        for (int i : arr) {
            sb.append(hm.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}