import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int half = 0, limit = 30;

        for (int i = 0; i < n; i++) {
            int classes = Integer.parseInt(br.readLine());
            if (limit >= classes) {
                limit -= classes;
                half++;
                if(limit<=0) limit = 30;
            } else {
                if(classes - limit<=classes/2) half++;
                limit = 30;
            }
        }

        System.out.println(half);
    }
}