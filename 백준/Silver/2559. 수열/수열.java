import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int caseCount = 1;

    public static void main(String[] args) throws IOException {
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st1.nextToken());
        int size = Integer.parseInt(st1.nextToken());
        int[] nums = new int[count];
        int[] sums = new int[count-size+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum +=nums[i];
        }

        sums[0] = sum;
        int start = 1;
        int end = size+1;

        while(start<=count-size){
            sums[start] = sums[start-1]-nums[start-1]+nums[end-1];
            start++;
            end++;
        }

        int max = Integer.MIN_VALUE;
        for (int i : sums) {
            if(i>max){
                max = i;
            }
        }

        System.out.println(max);
    }
}