import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        long i = factorial(a) / (factorial(b) * factorial(a - b));

        System.out.println(i);
    }

    public static long factorial(int a){
        if(a==1) return 1;
        if(a==0) return 1;
        return a*factorial(a-1);
    }
}