import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Integer count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            Deque<Integer> dq = new LinkedList<>();
            String command = br.readLine();
            Integer size = Integer.parseInt(br.readLine());
            String[] it = br.readLine().replace("[", "").replace("]", "").split(",");
            solution(dq, command, size, it);
        }

        System.out.println(sb);
    }

    private static void solution(Deque<Integer> dq, String command, Integer size, String[] it) {
        for (int i = 0; i < size; i++) {
            dq.add(Integer.parseInt(it[i]));
        }

        boolean rev = false;

        for (char c : command.toCharArray()) {
            if (c == 'R') {
                rev = !rev;
            }
            if (c == 'D') {
                if (!dq.isEmpty()) {
                    if (rev) {
                        dq.pollLast();
                    } else {
                        dq.pollFirst();
                    }
                } else {
                    sb.append("error\n");
                    return;
                }
            }
        }
        sb.append("[");
        while (!dq.isEmpty()) {
            if (rev) {
                sb.append(dq.pollLast());
            } else {
                sb.append(dq.pollFirst());
            }

            if (!dq.isEmpty()) {
                sb.append(",");
            }

        }

        sb.append("]").append("\n");
    }
}