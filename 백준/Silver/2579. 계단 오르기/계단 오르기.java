import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Integer count = Integer.parseInt(br.readLine());
        int[] stairs = new int[count+1];
        int[] dp = new int[count+1];

        for (int i = 1; i <= count; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = stairs[1];
        if(count==1) {
            System.out.println(stairs[1]);
            return;
        }
        dp[2] = stairs[1] + stairs[2];

        for (int i = 3; i <= count; i++) {
            dp[i] = Math.max(dp[i-2],dp[i-3]+stairs[i-1])+stairs[i];
        }

        System.out.println(dp[count]);
    }
}