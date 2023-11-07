import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb =new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st =new StringTokenizer(br.readLine());

        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[b+1];

        arr[0]=true;
        arr[1]=true;

        for (int i = 2; i * i <= b; i++) {
            if(arr[i])
                continue;
            for (int j = i * i; j <= b; j += i) {
                arr[j]=true;
            }
        }

        for (int i = a; i <= b; i++) {
            if(!arr[i])
                sb.append(i).append("\n");
        }

        System.out.print(sb);
    }
}