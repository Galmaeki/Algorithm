import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Integer a = Integer.parseInt(br.readLine());

        int sum = IntStream.range(1, a+1).sum();

        int t = sum * sum;

        System.out.println(sum);
        System.out.println(t);
        System.out.println(t);
    }
}


