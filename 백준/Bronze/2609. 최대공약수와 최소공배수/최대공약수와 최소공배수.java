import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max,min;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        min = minN(a,b);
        max = (a*b)/min;

        System.out.println(min);
        System.out.println(max);
    }

    private static int minN(int a, int b) {
        if(b==0) return a;
        return minN(b,a%b);
    }
}