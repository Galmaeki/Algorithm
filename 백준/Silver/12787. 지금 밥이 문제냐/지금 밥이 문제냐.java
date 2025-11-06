import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            if(st.nextToken().equals("1")) goToDecimal(st.nextToken());
            else goToIpv8(st.nextToken());
        }

        System.out.println(sb);
    }

    private static void goToIpv8(String s) {
        BigInteger min = new BigInteger(s);
        BigInteger e = new BigInteger("256");
        String[] strs = new String[8];

        for (int i = 8; i > 0; i--) {
            strs[i-1] = min.mod(e).toString();
            min = min.shiftRight(8);
        }

        for (String str : strs) {
            sb.append(str).append(".");
        }

        sb.deleteCharAt(sb.length()-1);
        sb.append("\n");
    }

    private static void goToDecimal(String s) {
        String[] ipv8 = s.split("\\.");
        BigInteger pls = BigInteger.ZERO;

        for(String str : ipv8){
            pls = pls.shiftLeft(8).add(new BigInteger(str));//(pls<<8) +Integer.parseInt(str);
        }

        sb.append(pls).append("\n");
    }
}
