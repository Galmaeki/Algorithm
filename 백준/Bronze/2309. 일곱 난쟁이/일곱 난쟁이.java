import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;
        int targetA =0;
        int targetB =0;
        for (int i = 0; i < 9; i++) {
            arr[i]=Integer.parseInt(br.readLine());
            sum+=arr[i];
        }

        Arrays.sort(arr);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(i==j) continue;
                if(sum-arr[i]-arr[j]==100){
                    targetA = i;
                    targetB = j;
                    break;
                }
                if(targetB!=0&&targetA!=0) break;
            }
        }

        for (int i = 0; i < 9; i++) {
            if(i!=targetA&&i!=targetB){
                sb.append(arr[i]).append("\n");
            }
        }

        System.out.println(sb);
    }
}