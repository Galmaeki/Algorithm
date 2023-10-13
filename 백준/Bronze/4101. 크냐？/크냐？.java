import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;
        while (!((line = br.readLine()).equals("0 0"))) {
            String[] nums = line.split(" ");

            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            sb.append(a>b?"Yes":"No").append("\n");
        }
        sb.setLength(sb.length()-1);

        System.out.print(sb);
    }

}