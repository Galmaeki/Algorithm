import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        int arr[][]  = new int[count][count];
        int sum[][] = new int[count][count];

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int j =0;
            while(st.hasMoreTokens()){
                arr[i][j] = Integer.parseInt(st.nextToken());
                j++;
            }
        }

        sum[0][0] = arr[0][0];

        for (int i = 1; i < count; i++) {
            for (int j = 0; j <= i; j++) {
                if(j==0){
                    sum[i][j] = sum[i-1][j] + arr[i][j];
                }else if (j==i){
                    sum[i][j] = sum[i-1][j-1] +  arr[i][j];
                } else {
                    sum[i][j] = Math.max(sum[i-1][j-1],sum[i-1][j])+arr[i][j];
                }
            }
        }

        int max = 0;
        for (int i : sum[count - 1]) {
            if(i>max) max = i;
        }

        System.out.println(max);
    }
}