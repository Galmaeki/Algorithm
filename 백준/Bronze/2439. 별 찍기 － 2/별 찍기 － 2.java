import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            for (int j = count; j > 0; j--) {
                if(j>i+1){
                    sb.append(" ");
                }else{
                    sb.append("*");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}