import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < 9; i++) {
            a-=Integer.parseInt(br.readLine());
        }
        System.out.print(a);
    }
}