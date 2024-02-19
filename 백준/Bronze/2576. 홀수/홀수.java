import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int answer = 0;
        int second = 101;

        for (int i = 0; i < 7; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a % 2 != 0) {
                answer += a;
                if (second > a) second = a;
            }
        }

        if (answer == 0) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
            System.out.println(second);
        }
    }
}