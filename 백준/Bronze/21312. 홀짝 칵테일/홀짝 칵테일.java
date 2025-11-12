import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        boolean hol = false;
        int max = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]%2==1) {
                max*=arr[i];
                hol = true;}
        }

        if(!hol) max = arr[0]*arr[1]*arr[2];

        System.out.println(max);
    }
}