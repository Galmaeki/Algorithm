import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger bi = new BigInteger(st.nextToken());
        System.out.println(bi.add(new BigInteger(st.nextToken())));
    }
}