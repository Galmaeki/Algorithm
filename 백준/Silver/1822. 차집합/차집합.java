import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            setA.add(Integer.parseInt(st1.nextToken()));
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            setB.add(Integer.parseInt(st2.nextToken()));
        }

        for (Integer i : setB) {
            setA.remove(i);
        }

        ArrayList<Integer> al = new ArrayList<>(setA);

        if (al.isEmpty()) {
            System.out.println(0);
        } else {
            al.sort(Comparator.naturalOrder());

            sb.append(al.size()).append("\n");

            for (Integer i : al) {
                sb.append(i).append(" ");
            }

            System.out.println(sb);
        }
    }
}