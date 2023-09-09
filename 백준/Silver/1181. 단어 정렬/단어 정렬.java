import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> al = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        int count = Integer.parseInt(br.readLine());

        String[] st = new String[count];
        for (int i = 0; i < count; i++) {
            st[i]=br.readLine();
        }

        for (String s : st) {
            if(isLetter(s))
                hs.add(s);
        }

        for (String s : hs) {
            al.add(s);
        }

        Collections.sort(al,(s1,s2)->{
            if(s1.length()==s2.length())
               return s1.compareTo(s2);
            return s1.length()-s2.length();
        });

        for (String s : al) {
            System.out.println(s);
        }
    }

    static boolean isLetter(String s){
        for (char c : s.toCharArray()) {
            if(Character.isDigit(c))
                return false;
        }
        return true;
    }
}