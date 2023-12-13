import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BigInteger dp[] = new BigInteger[101];

        dp[1] = dp[2] = dp[3] = BigInteger.ONE;
        dp[5]=dp[4]=BigInteger.TWO;

        for (int i = 6; i <= 100; i++) {
            dp[i] = dp[i-5].add(dp[i-1]);
        }

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            sb.append(dp[Integer.parseInt(br.readLine())]).append("\n");
        }

        System.out.print(sb);
    }
}
