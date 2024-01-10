import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int x=0,y=0,answer = -1;
        for (int i = 1; i <= 9; i++) {
            String[] strings = br.readLine().split(" ");
            for (int j = 1; j <= 9; j++) {
                int n = Integer.parseInt(strings[j-1]);
                if (n>answer){
                    answer = n; x = i;  y=j;
                }
            }
        }

        System.out.println(answer);
        System.out.println(x+" "+y);
    }
}