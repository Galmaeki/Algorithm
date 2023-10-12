import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String text = br.readLine();

            if (text.startsWith("push_front"))
                dq.addFirst(Integer.parseInt(text.substring(11, text.length())));
            else if (text.startsWith("push_back")) {
                dq.add(Integer.parseInt(text.substring(10, text.length())));
            } else if (text.equals("pop_front")) {
                Integer a = dq.pollFirst();
                sb.append(a == null ? -1 : a).append("\n");
            } else if (text.equals("pop_back")) {
                Integer a = dq.pollLast();
                sb.append(a == null ? -1 : a).append("\n");
            } else if (text.equals("size")) {
                sb.append(dq.size()).append("\n");
            }else if (text.equals("empty")){
                sb.append(dq.isEmpty()?1:0).append("\n");
            } else if (text.equals("front")) {
                Integer a = dq.peekFirst();
                sb.append(a==null?-1:a).append("\n");
            }else if (text.equals("back")) {
                Integer a = dq.peekLast();
                sb.append(a==null?-1:a).append("\n");
            }

        }

        sb.setLength(sb.length()-1);

        System.out.print(sb);
    }

}