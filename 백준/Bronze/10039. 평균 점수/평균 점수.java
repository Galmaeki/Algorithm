import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a<40)
                a = 40;
            sum+=a;
        }
        System.out.println(sum/5);
    }
}