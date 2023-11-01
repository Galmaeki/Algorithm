import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] d = new int[11];

        d[0]=0;
        d[1]=1;
        d[2]=2;
        d[3]=4;

        for (int i = 4; i < 11; i++) {
            d[i]= d[i-1]+d[i-2]+d[i-3];
        }

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            System.out.println(d[Integer.parseInt(br.readLine())]);
        }
    }
}
