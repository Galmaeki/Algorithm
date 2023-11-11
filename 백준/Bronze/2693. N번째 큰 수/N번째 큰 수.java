import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            StringTokenizer st =new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()){
                al.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(al,Comparator.reverseOrder());
            sb.append(al.get(2));
            sb.append("\n");
        }

        System.out.print(sb);
    }
}