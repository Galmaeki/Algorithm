import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int arr[];
    static int target;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st1.nextToken());
        target = Integer.parseInt(st1.nextToken());
        arr = new int[count];
        int answer = 0;

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        long L = 0;
        long R = 2000000000;

        while (L <= R) {
            long mid = (L + R) / 2;
            if (check(mid)) {
                answer = (int) mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        System.out.println(answer);
    }

    private static boolean check(long mid) {
        long sum = 0;
        for (int i : arr) {
            if (i > mid) sum += i - mid;
        }
        return sum >= target;
    }
}