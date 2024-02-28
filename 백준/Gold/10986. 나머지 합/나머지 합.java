import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        long answer = 0;
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st1.nextToken());
        int div = Integer.parseInt(st1.nextToken());

        long[] sums = new long[count];
        long[] divs = new long[div];

        StringTokenizer st = new StringTokenizer(br.readLine());

        sums[0] = Integer.parseInt(st.nextToken());
        if(sums[0] % div ==0) answer++;
        divs[(int)(sums[0] % div)]++;

        for (int i = 1; i < count; i++) {

            sums[i]= Integer.parseInt(st.nextToken())+sums[i-1];
            if(sums[i] % div ==0) answer++;

            divs[(int)(sums[i] % div)]++;
        }

        for (int i = 0; i < div; i++) {
            if(divs[i]>1) answer += (divs[i]*(divs[i]-1))/2;
        }

        System.out.println(answer);
    }
}