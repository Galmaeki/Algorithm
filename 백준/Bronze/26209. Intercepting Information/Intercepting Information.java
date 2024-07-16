import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean readable = false;
        while (st.hasMoreTokens()) {
            int i = Integer.parseInt(st.nextToken());
            if (i != 0 && i != 1) {
                readable = true;
                break;
            }
        }
        System.out.println(readable ? "F" : "S");
    }
}