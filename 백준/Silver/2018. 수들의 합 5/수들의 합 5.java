import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int answer = 0;
        int start = 1;
        int end = 1;

        while(end<=n){
            int sum = 0;

            for (int i = start; i <= end; i++) {
                sum+=i;
            }

            if(sum>n){
                start++;
            } else if (sum < n) {
                end++;
            } else if (sum == n) {
                end++;
                answer++;
            }
        }

        System.out.println(answer);
    }
}