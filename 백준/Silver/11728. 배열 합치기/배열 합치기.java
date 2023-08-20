import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> al = new ArrayList();
        br.readLine();
        int[] first = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] second = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int a:first){
            al.add(a);
        }
        for(int a:second){
            al.add(a);
        }
        Collections.sort(al);
        for(int a:al){
            sb.append(a+" ");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}