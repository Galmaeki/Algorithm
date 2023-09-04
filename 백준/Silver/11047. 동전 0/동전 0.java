import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        int count = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int[] coins = new int[count];

        for(int i=0;i<count;i++){
            coins[i]=Integer.parseInt(br.readLine());
        }

        for(int i=coins.length-1;i>=0;i--){
            while(money>=coins[i]){
                money-=coins[i];
                answer++;
            }
        }
        System.out.println(answer);
    }
}