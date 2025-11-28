import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sto = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(sto.nextToken());
        int y = Integer.parseInt(sto.nextToken()) + 1;
        int t = Integer.parseInt(sto.nextToken());
        int[] arr = new int[t];
        int max = 1000000;

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int xx = Integer.parseInt(st.nextToken());
            int xy = Integer.parseInt(st.nextToken());

            arr[i] = (xx - 1) + (y - xy);
            if (max > arr[i]) max = arr[i];
        }

        for (int i = 0; i < t; i++) {
            if (max == arr[i]) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
