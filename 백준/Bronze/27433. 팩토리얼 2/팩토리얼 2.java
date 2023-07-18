import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main{
    static BigDecimal bg = new BigDecimal(1);

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double f = Double.parseDouble(st.nextToken());
        factorial(f);
        System.out.println(bg.toBigInteger());
    }

    static void factorial(double n){
        if(n<=1){

        }else {
            bg = bg.multiply(BigDecimal.valueOf(n));
            factorial(n-1);
        }
    }
}