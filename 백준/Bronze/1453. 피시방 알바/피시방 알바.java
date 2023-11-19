import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        boolean[] arr = new boolean[101];

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            int s = Integer.parseInt(st.nextToken());
            if(!arr[s]) arr[s] = true;
            else answer++;
        }

        System.out.println(answer);
    }
}