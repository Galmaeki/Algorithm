import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = 0;
        int target = 0;
        
        while(m<n){
            target++;
            String a = ""+target;
            if(a.contains("666")){
                m++;
            }
        }
            System.out.print(target);
    }
}