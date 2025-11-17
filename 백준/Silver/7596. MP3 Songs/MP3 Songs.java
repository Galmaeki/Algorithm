import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int a = 1;
        while (n != 0) {
            ArrayList<String> al = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                al.add(br.readLine());
            }
            sb.append(a).append("\n");
            a++;

            al.sort(Comparator.naturalOrder());

            al.stream().forEach(s -> sb.append(s).append("\n"));
            n = Integer.parseInt(br.readLine());
        }

        System.out.println(sb);
    }
}

