import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(br.readLine());
        double b = (a - (a * 0.22));
        double c = (a * 0.8 + ((a * 0.2) - ((a * 0.2) * 0.22)));
        System.out.println((int) b + " " + (int) c);
    }
}