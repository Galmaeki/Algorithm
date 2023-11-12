import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split("-");

        for (String str : strs) {
            sb.append(str.charAt(0));
        }

        System.out.print(sb);
    }
}