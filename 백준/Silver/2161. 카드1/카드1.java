import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> qu = new LinkedList<>();
        StringBuilder sb =new StringBuilder();
        int start = Integer.parseInt(br.readLine());

        for (int i = 1; i <= start; i++) {
            qu.add(i);
        }

        while(qu.size()>1){
            sb.append(qu.poll()).append(" ");
            qu.add(qu.poll());
        }

        sb.append(qu.poll());

        System.out.println(sb);
    }
}