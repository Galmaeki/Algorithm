import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            if ("0".equals(line))
                break;
            BigInteger bigInteger = new BigInteger(line);
            if(bigInteger.remainder(new BigInteger("42")).equals(BigInteger.ZERO)){
                sb.append("PREMIADO").append("\n");
            }else{
                sb.append("TENTE NOVAMENTE").append("\n");
            }
        }
        System.out.println(sb);
    }
}


