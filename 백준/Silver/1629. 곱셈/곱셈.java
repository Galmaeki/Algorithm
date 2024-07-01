import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        // a ^ b / c
        Long a = Long.parseLong(st.nextToken());
        Long b = Long.parseLong(st.nextToken());
        Long c = Long.parseLong(st.nextToken());

        System.out.println(solution(a, b, c));
    }

    private static long solution(Long a, Long b, Long c) {
        if (b == 1) {
            return a % c;
        } else {
            long half = solution(a, b / 2, c);

            if (b % 2 == 1) {
                return (half * half % c) * a % c;
            }

            return half * half % c;
        }
    }
}