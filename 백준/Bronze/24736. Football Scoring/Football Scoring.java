import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = adds(st);
        st = new StringTokenizer(br.readLine());
        int b = adds(st);
        System.out.println(a +" "+b );
    }

    private static int adds(StringTokenizer st) {
        int a = 0;
        a+=Integer.parseInt(st.nextToken())*6;
        a+=Integer.parseInt(st.nextToken())*3;
        a+=Integer.parseInt(st.nextToken())*2;
        a+=Integer.parseInt(st.nextToken());
        a+=Integer.parseInt(st.nextToken())*2;
        return a;
    }
}