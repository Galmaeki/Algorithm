import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        TreeSet<Integer> ts = new TreeSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            ts.add(Integer.parseInt(br.readLine())%42);
        }

        System.out.println(ts.size());
    }
}