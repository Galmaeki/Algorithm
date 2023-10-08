import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] ch1 = st.nextToken().toCharArray();
        char[] ch2 = st.nextToken().toCharArray();

        int a = (ch1[0]-48)*1+(ch1[1]-48)*10+(ch1[2]-48)*100;
        int b = (ch2[0]-48)*1+(ch2[1]-48)*10+(ch2[2]-48)*100;

        System.out.println(a>b?a:b);
    }
}