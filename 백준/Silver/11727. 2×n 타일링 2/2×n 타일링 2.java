import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] dp= new int[1001];
        dp[0]=0;
        dp[1]=1;
        dp[2]=3;
        for (int i = 3; i <= count; i++) {
            dp[i]=(dp[i-1]+(dp[i-2]*2))%10007;
        }

        System.out.println(dp[count]);
    }
}