import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int answer = 0;

        String b = ""+factorial(a);

        for (int i = b.length()-1; i >= 0; i--) {
            if(b.charAt(i)=='0') answer++;
            else break;
        }

        System.out.println(answer);
    }

    public static BigInteger factorial(int a) {
        if (a == 1) return BigInteger.ONE;
        if (a == 0) return BigInteger.ONE;
        return new BigInteger(String.valueOf(a)).multiply(factorial(a-1));
    }
}