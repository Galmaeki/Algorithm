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
        int target = Integer.parseInt(br.readLine());
        int[] arr = new int[count];
        int start = 0, end = count - 1, answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        while(start<end){
            int sum = arr[start] + arr[end];

            if(sum==target){
                answer++;
                start++;
                end--;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }

        System.out.println(answer);

    }
}