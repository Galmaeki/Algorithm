import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        HashMap<LocalDate, String> hm = new HashMap<>();
        ArrayList<LocalDate> al = new ArrayList<>();
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            LocalDate date = LocalDate.of(year,month,day);
            al.add(date);
            hm.put(date,name);
        }

        Collections.sort(al);

        sb.append(hm.get(al.get(al.size()-1))).append("\n");
        sb.append(hm.get(al.get(0))).append("\n");

        System.out.print(sb);
    }
}