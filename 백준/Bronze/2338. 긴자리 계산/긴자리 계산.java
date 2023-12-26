import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        BigInteger x = new BigInteger(br.readLine());
        BigInteger y = new BigInteger(br.readLine());

        sb.append(x.add(y)).append("\n");
        sb.append(x.subtract(y)).append("\n");
        sb.append(x.multiply(y));

        System.out.println(sb);
    }
}