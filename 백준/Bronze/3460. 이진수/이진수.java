import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String a = Integer.toBinaryString(Integer.parseInt(br.readLine()));
            int b =0;
            bin(a);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void bin(String a) {
        StringBuilder sb1 = new StringBuilder(a);
        String str = sb1.reverse().toString();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='1')
                sb.append(i).append(" ");
        }
    }
}
