import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        char[] eight = br.readLine().toCharArray();

        if (eight[0] == 48) {
            System.out.println("0");
        } else {
            for (char c : eight) {
                formating(c);
            }
            System.out.println(sb.toString().replaceFirst("^0+", ""));
        }
    }

    static void formating(char ch) {
        int[] chars = new int[3];
        int n = ch - 48;

        if (n % 2 == 1) {
            chars[2] = 1;
        } else {
            chars[2] = 0;
        }

        n = n / 2;

        if (n % 2 == 1) {
            chars[1] = 1;
        } else {
            chars[1] = 0;
        }

        n = n / 2;

        if (n % 2 == 1) {
            chars[0] = 1;
        } else {
            chars[0] = 0;
        }

        for (int i : chars) {
            sb.append(i);
        }
    }
}