import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            hs.add(Integer.parseInt(st.nextToken()));
        }

        Iterator<Integer> iterator = hs.iterator();

        while(iterator.hasNext()){
            al.add(iterator.next());
        }

        Collections.sort(al);

        for (Integer integer : al) {
            sb.append(integer).append(" ");
        }

        System.out.println(sb);
    }
}