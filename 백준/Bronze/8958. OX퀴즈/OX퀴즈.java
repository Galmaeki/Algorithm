import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        String arr[] = new String[count];
        for (int i = 0; i < count; i++) {
            arr[i]= br.readLine();
        }

        for (int i = 0; i < count; i++) {
            int score=1;
            int result =0;
            for (int j = 0; j < arr[i].length(); j++) {
                if(arr[i].charAt(j)=='O'){
                    result+=score;
                    score++;
                } else {
                    score=1;
                }
            }
            System.out.println(result);
        }
    }
}