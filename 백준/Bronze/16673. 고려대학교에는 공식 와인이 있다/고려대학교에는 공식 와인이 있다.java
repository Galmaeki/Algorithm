import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long years = 0;

        long c = Integer.parseInt(st.nextToken());
        long k = Integer.parseInt(st.nextToken());
        long p = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= c; i++) {
            years += (i * k) + (p * ((long) i * i));
        }

        System.out.println(years);
    }
}

