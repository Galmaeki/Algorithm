import java.io.*;
import java.util.*;

public class Main{
    static int N,M;
    static int[] select;
    static StringBuilder sb = new StringBuilder();
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        select = new int[M+1];

        func(1);
        System.out.println(sb.toString());
    }
    static void func(int n){
        if(n==M+1){
            for(int i = 1;i<=M;i++){
                sb.append(select[i]).append(' ');
            }
            sb.append('\n');
        }else{
            for(int i=1; i<=N;i++){
                select[n] = i;

                func(n+1);
                select[n]=0;
            }
        }
    }
}