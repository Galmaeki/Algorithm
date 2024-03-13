import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int arr[] = {1,1,2,2,2,8};
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i : arr) {
            i-=Integer.parseInt(st.nextToken());
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}