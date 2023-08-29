import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a,b,c,d;
        String second;
        a=Integer.parseInt(br.readLine());
        second = br.readLine();
        d = second.charAt(0)-48;
        c = second.charAt(1)-48;
        b = second.charAt(2)-48;
        System.out.println(a*b);
        System.out.println(a*c);
        System.out.println(a*d);
        System.out.println((a*b)+(a*c*10)+(a*d*100));
    }
}