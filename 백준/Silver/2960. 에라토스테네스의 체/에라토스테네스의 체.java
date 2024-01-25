import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        int answer = 0;
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        boolean[] arr = new boolean[N + 1];

        for (int i = 2; i <= N; i++) {
            if (arr[i]) continue;
            count++;
            if (count == K) {
                answer = i;
                break;
            }
            for (int j = i * i; j <= N; j += i) {
                if(arr[j]) continue;
                arr[j] = true;
                count++;
                if (count == K) {
                    answer = j;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}