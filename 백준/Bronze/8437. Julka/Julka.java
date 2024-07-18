import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        BigInteger total = new BigInteger(br.readLine());
        BigInteger diff = new BigInteger(br.readLine());
        BigInteger two = new BigInteger("2");

        BigInteger a = (total.subtract(diff)).divide(two).add(diff);
        BigInteger b = (total.subtract(diff)).divide(two);

        System.out.println(a);
        System.out.println(b);
    }
}