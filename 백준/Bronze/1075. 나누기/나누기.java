import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = (Integer.parseInt(br.readLine())/100)*100;
        int F = Integer.parseInt(br.readLine());
        while(N%F!=0){
            N++;
        }
        sb.append(N);

        System.out.println(sb.substring(sb.length()-2,sb.length()));
    }
}