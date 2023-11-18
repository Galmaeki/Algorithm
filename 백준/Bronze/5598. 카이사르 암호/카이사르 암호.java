import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        for (char c : str.toCharArray()) {
            if(c-3<'A'){
                sb.append((char)(c+23));
            }else{
                sb.append((char)(c-3));
            }
        }

        System.out.println(sb);
    }
}