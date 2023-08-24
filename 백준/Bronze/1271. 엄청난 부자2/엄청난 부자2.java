import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigDecimal number = new BigDecimal(st.nextToken());
        BigDecimal div =  new BigDecimal(st.nextToken());
        System.out.println(number.divide(div,0, RoundingMode.DOWN));
        System.out.println(number.remainder(div));
        }
}