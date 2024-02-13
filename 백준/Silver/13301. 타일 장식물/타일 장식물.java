import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        long[] arr = new long[81];
        long[] answer = new long[81];

        arr[1]=1;
        answer[1]=4;
        arr[2]=1;
        answer[2]=6;
        arr[3]=2;
        answer[3]=10;
        arr[4]=3;
        answer[4]=16;

        for (int i = 5; i < 81; i++) {

            arr[i]= arr[i-1]+arr[i-3]+arr[i-4];
            answer[i]= (arr[i]*4)+(arr[i-1]*2);
        }

        System.out.println(answer[Integer.parseInt(br.readLine())]);
    }
}