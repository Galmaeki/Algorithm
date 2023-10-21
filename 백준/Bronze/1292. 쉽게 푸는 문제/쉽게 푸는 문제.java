import java.io.*;
import java.time.DayOfWeek;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idx = 0;
        int val = 1;
        int sum = 0;
        int arr[] = new int[1000];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken())-1;
        int end = Integer.parseInt(st.nextToken());

        while(idx<1000){
            for (int i = 0; i < val && idx < 1000; i++) {
                arr[idx] = val;
                idx++;
            }
            val++;
        }

        for (int i = start; i < end; i++) {
            sum+=arr[i];
        }

        System.out.println(sum);
    }
}