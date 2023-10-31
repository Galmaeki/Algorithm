import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = -1;
        int top = 0;

        for (int i = 0; i < 5; i++) {
            int a = 0;
            String[] str = br.readLine().split(" ");
            for (String s : str) {
                a+=Integer.parseInt(s);
            }
            if(a>answer){
                answer = a;
                top = i+1;
            }
        }

        System.out.println(top + " " + answer);
    }
}
