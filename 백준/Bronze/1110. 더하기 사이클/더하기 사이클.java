import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count =0;
        int start = Integer.parseInt(br.readLine());
        int now = start;

        while (true) {
            int first = now % 100 / 10;
            int second = now % 10;
            int third = first + second;
            count++;
            now = second * 10 + third % 10;
            if(now==start)
                break;
        }

        System.out.println(count);
    }
}