import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        BigDecimal bd = new BigDecimal(br.readLine());
        BigDecimal add = bd.add(new BigDecimal(br.readLine()));

        System.out.println(add);
    }
}