import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        long[] arr = new long[count];
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        for (int i = 0; i < count; i++) {
            long target = arr[i];
            int start = 0, end = count - 1;

            while (start < end) {
                if (arr[start] + arr[end] == target) {
                    if (start != i && end != i){
                        answer++;
                        break;
                    } else if (start == i) {
                        start++;
                    } else {
                        end--;
                    }
                } else if (arr[start] + arr[end] < target) {
                    start++;
                }else {
                    end--;
                }
            }
        }

        System.out.println(answer);
    }
}