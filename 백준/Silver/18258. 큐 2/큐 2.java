import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        LinkedList<String> qu = new LinkedList<>();
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String input = br.readLine();
            if(input.startsWith("push")) {
                qu.add(input.substring(5));
            } else if (input.startsWith("pop")) {
                if(qu.isEmpty())sb.append(-1).append("\n");
                else sb.append(qu.poll()).append("\n");
            }else if (input.startsWith("size")){
                sb.append(qu.size()).append("\n");
            } else if (input.startsWith("empty")) {
                sb.append(qu.isEmpty()?1:0).append("\n");
            } else if (input.startsWith("front")) {
                sb.append(qu.size()==0?-1:qu.peek()).append("\n");
            } else {
                sb.append(qu.size()==0?-1:qu.getLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}