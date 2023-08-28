import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> al = new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        char[] ch = br.readLine().toCharArray();
        for (char a: ch) {
            al.add(a);
        }
        Collections.sort(al, Comparator.reverseOrder());
        for(char a:al){
            sb.append(a);
        }
        System.out.println(sb);
    }
}