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
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        Deque<Node> dq = new LinkedList<>();

        int count = Integer.parseInt(st1.nextToken());
        int size = Integer.parseInt(st1.nextToken());
        int arr[] = new int[count];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < count; i++) {
            while (!dq.isEmpty() && dq.getLast().val > arr[i]) dq.removeLast();

            dq.addLast(new Node(i, arr[i]));
            if (dq.getFirst().idx <= i - size) dq.removeFirst();


            sb.append(dq.getFirst().val).append(" ");
        }

        System.out.println(sb);

    }

    static class Node {
        int idx;
        int val;

        Node(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }
    }
}