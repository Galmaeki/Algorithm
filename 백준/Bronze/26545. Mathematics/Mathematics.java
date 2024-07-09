import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(br.readLine());
        long sum = 0;
        for (int i = 0; i < a; i++) {
            sum+=Long.parseLong(br.readLine());
        }
        System.out.println(sum);
    }
}