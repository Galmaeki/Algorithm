import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st1= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken()) * Integer.parseInt(st1.nextToken());
        StringTokenizer st2= new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            sb.append(Integer.parseInt(st2.nextToken())-n)
                .append(" ");
        }

        System.out.println(sb);
    }
}