import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a=0;

        boolean[] arr = new boolean[1001];

        arr[0]=true;
        arr[1]=true;

        for (int i = 2; i * i <= 1000; i++) {
            if(arr[i])
                continue;
            for (int j = i * i; j <= 1000; j += i) {
                arr[j]=true;
            }
        }

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st =new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            if(!arr[Integer.parseInt(st.nextToken())])
                a++;
        }


        System.out.println(a);
    }
}