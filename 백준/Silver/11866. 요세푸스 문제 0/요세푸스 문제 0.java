import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Integer> qu = new LinkedList<>();
        int ind = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= a; i++) {
            qu.add(i);
        }

        sb.append("<");

        while (!qu.isEmpty()) {
            if(ind<b-1){
                qu.add(qu.poll());
                ind++;
            }else{
                sb.append(qu.poll()).append(", ");
                ind =0;
            }
        }

        sb.setLength(sb.length()-2);
        sb.append(">");

        System.out.println(sb);
    }
}