import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st1.nextToken());
        int snake = Integer.parseInt(st1.nextToken());

        int[] arr= new int[count];
        StringTokenizer st2 =new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            arr[i]= Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);

        for (int i : arr) {
            if(snake>=i) snake++;
        }

        System.out.println(snake);

    }
}