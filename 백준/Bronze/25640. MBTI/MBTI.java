import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String mbti = br.readLine();
        int count = Integer.parseInt(br.readLine());
        int a = 0;
        for (int i = 0; i < count; i++) {
            if (mbti.equals(br.readLine())) a++;
        }

        System.out.println(a);
    }
}