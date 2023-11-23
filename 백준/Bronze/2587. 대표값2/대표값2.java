import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum =0;
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[i]=a;
            sum+=a;
        }

        Arrays.sort(arr);

        System.out.println(sum/5+"\n"+arr[2]);
    }
}