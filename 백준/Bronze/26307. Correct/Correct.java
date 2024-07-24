import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int time =
            ((Integer.parseInt(st1.nextToken()) - 9) * 60) + Integer.parseInt(st1.nextToken());

        System.out.println(time);
    }
}