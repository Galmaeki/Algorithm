import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        boolean[] arr = new boolean[30];

        for (int i = 0; i < 28; i++) {
            int a = Integer.parseInt(br.readLine())-1;
            arr[a] =true;
        }

        for (int i = 0; i < 30; i++) {
            if(!arr[i]) sb.append(i+1).append("\n");
        }

        System.out.print(sb);
    }
}