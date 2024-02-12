import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BigInteger[] bi = new BigInteger[10001];
        int count = Integer.parseInt(br.readLine());

        bi[0]= BigInteger.ZERO;
        bi[1]= BigInteger.ONE;
        bi[2]= BigInteger.ONE;

        for (int i = 3; i < 10001; i++) {
            bi[i]=bi[i-1].add(bi[i-2]);
        }

        System.out.println(bi[count]);
    }
}