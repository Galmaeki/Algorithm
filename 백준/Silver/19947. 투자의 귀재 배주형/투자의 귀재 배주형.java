import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int cash = Integer.parseInt(input[0]);
        int year = Integer.parseInt(input[1]);

        int[] dp = new int[year + 1];

        dp[0] = cash;

        for (int i = 1; i <= year; i++) {
            dp[i] = dp[i-1] +(int) (dp[i - 1] * 0.05);
            if (i >= 3)
                dp[i] = Math.max(dp[i], (int)(dp[i - 3] * 1.2));
            if (i >= 5)
                dp[i] = Math.max(dp[i], (int)(dp[i - 5] * 1.35));
        }

        System.out.println(dp[year]);
    }
}