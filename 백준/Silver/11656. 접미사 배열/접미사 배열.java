import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb =new StringBuilder();
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<String> al = new ArrayList<>();

        al.add(str);
        for (int i = str.length()-1; i > 0; i--) {
            al.add(str.substring(i,str.length()));
        }

        Collections.sort(al);

        al.stream().forEach(s -> sb.append(s).append("\n"));

        System.out.print(sb);
    }
}
