import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet hs = new HashSet<Integer>();
        for(int i =0;i<10;i++){
            hs.add(Integer.parseInt(br.readLine())%42);
        }
        System.out.println(hs.size());
    }
}