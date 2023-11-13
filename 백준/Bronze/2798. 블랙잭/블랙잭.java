import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int answer = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;
        int[] arr = new int[count];
        StringTokenizer st1 = new StringTokenizer(br.readLine());



        for (int i = 0; i < count; i++) {
            arr[i]=Integer.parseInt(st1.nextToken());
        }

        for (int i = 0; i < count; i++) {
            for (int j = i+1; j < count; j++) {
                for (int k = j+1; k < count; k++) {
                    int a = arr[i]+arr[j]+arr[k];
                    if(max< a&&a<=answer){
                        max = a;
                    }
                }
            }
        }

        System.out.print(max);
    }
}