import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Deque<Integer> dq = new LinkedList<>();

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int cmd = Integer.parseInt(st.nextToken());

            if (cmd == 1) dq.addFirst(Integer.parseInt(st.nextToken()));
            else if (cmd == 2) dq.addLast(Integer.parseInt(st.nextToken()));
            else if (cmd == 3) sb.append(dq.isEmpty() ? -1 : dq.pop()).append("\n");
            else if (cmd == 4) sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append("\n");
            else if (cmd == 5) sb.append(dq.size()).append("\n");
            else if (cmd == 6) sb.append(dq.isEmpty()?1:0).append("\n");
            else if (cmd == 7) sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append("\n");
            else if (cmd == 8) sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append("\n");
        }

        System.out.println(sb);
    }
}