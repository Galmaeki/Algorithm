import java.io.*;
import java.time.DayOfWeek;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> al = new ArrayList<>();
        int longest = 0;

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            if(longest<s.length())
                longest = s.length();
            al.add(s);
        }

        for (int i = 0; i < longest; i++) {
            for (int j = 0; j < 5; j++) {
                try{
                sb.append(al.get(j).charAt(i));
                }catch (Exception e){}
            }
        }
        
        System.out.println(sb);
    }
}