import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            int min = 101;

            for (int j = 0; j < 7; j++) {
                int a = Integer.parseInt(st.nextToken());
                if(a%2==0){
                    sum+=a;
                    if(min>a){
                        min = a;
                    }
                }
            }
            sb.append(sum).append(" ").append(min).append("\n");
        }

        System.out.print(sb);
    }
}