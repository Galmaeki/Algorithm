import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        List<Integer> al = new ArrayList<>();
        
        int count = Integer.parseInt(st1.nextToken());
        int result = Integer.parseInt(st1.nextToken());
        
        while(st2.hasMoreTokens()){
            al.add(Integer.parseInt(st2.nextToken()));
        }
        Collections.sort(al);
        System.out.println(al.get(result-1));
    }
}