import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int b = 0;

        while(st.hasMoreTokens()){
            if(a.equals(st.nextToken()))
                b++;
        }

        System.out.println(b);
    }
}