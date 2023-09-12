import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> qu = new LinkedList<>();
        boolean switching = true;
        int num = Integer.parseInt(br.readLine());

        for (int i=1;i<=num;i++) {
            qu.offer(i);
        }

        while (qu.size()!=1){
            if(switching){
                qu.poll();
                switching=!switching;
            }else{
                qu.offer(qu.poll());
                switching=!switching;
            }
        }
        System.out.println(qu.poll());
    }
}