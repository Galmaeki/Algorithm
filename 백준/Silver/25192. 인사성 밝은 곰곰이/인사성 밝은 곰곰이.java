import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        int count = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < count; i++) {
            String s = br.readLine();
            if(s.equals("ENTER")){
             answer+=set.size();
             set.clear();
            }else{
                set.add(s);
            }
        }

        answer +=set.size();
        System.out.println(answer);
    }
}