import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int lines = Integer.parseInt(br.readLine());
        int[] al = new int[lines];
        for (int i = 0; i < lines; i++) {
            al[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(al);
        for (int a:al) {
            sb.append(a).append("\n");
        }
        System.out.println(sb);
    }
}