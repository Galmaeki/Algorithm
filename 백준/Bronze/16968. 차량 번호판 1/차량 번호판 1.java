import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        char[] chars = br.readLine().toCharArray();
        int ans = 1;
        for (int i = 0; i < chars.length; i++) {
            int v = 0;
            if (chars[i] == 'c') {
                if (i > 0 && chars[i - 1] == 'c') v = 25;
                else v = 26;
            } else {
                if (i > 0 && chars[i - 1] == 'd') v = 9;
                else v = 10;
            }
            ans *= v;
        }

        System.out.println(ans);
    }
}