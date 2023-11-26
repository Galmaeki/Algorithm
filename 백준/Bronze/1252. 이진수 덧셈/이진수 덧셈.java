import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int carry = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger bi1 = new BigInteger(st.nextToken());
        BigInteger bi2 = new BigInteger(st.nextToken());
        String str1 = bi1.toString();
        String str2 = bi2.toString();
        int length1 = str1.length(), length2 = str2.length();
        int maxlength = length1 > length2 ? length1 : length2;

        for (int i = 0; i < maxlength; i++) {
            int num1 = i < length1?(str1.charAt(length1-1-i)-'0'):0;
            int num2 = i < length2?(str2.charAt(length2-1-i)-'0'):0;

            sb.append(num1+num2+carry==1||num1+num2+carry==3?1:0);
            carry = num1+num2+carry>=2?1:0;
        }

        if(carry!=0) sb.append(1);

        System.out.println(sb.reverse());
    }
}