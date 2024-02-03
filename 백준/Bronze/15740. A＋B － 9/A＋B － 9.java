import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigDecimal bi1 = new BigDecimal(st.nextToken());
        BigDecimal bi2 = new BigDecimal(st.nextToken());

        System.out.println(bi1.add(bi2));
    }
}