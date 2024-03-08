import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line =br.readLine())!=null){
            int lower=0, upper=0, number = 0, space = 0;
            for (char c : line.toCharArray()) {
                if(c>='A'&&c<='Z') lower++;
                if(c>='a'&&c<='z') upper++;
                if(c>='0'&&c<='9') number++;
                if(c==' ') space++;


            }

            sb.append(upper).append(" ");
            sb.append(lower).append(" ");
            sb.append(number).append(" ");
            sb.append(space).append("\n");
        }
        System.out.println(sb);
    }
}