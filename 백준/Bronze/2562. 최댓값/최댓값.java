import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> al = new ArrayList();
        for(int i=0;i<9;i++){
            al.add(Integer.parseInt(br.readLine()));
        }
        int max = Collections.max(al);
        int ind = al.indexOf(max);
        System.out.println(max);
        System.out.println(ind+1);
    }
}