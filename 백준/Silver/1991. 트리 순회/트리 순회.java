import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        HashMap<String, Node> hm = new HashMap<>();
        Integer a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String head = st.nextToken();
            String left = st.nextToken();
            String right = st.nextToken();
            Node headNode = new Node(head);
            if(!hm.containsKey(head)) hm.put(head, headNode);
            if(!hm.containsKey(left)&&!left.equals(".")) hm.put(left,new Node(left));
            if(!hm.containsKey(right)&&!right.equals(".")) hm.put(right,new Node(right));
            hm.get(head).left = hm.get(left);
            hm.get(head).right = hm.get(right);
        }

        Node head = hm.get("A");
        front(head);
        sb.append("\n");
        mid(head);
        sb.append("\n");
        back(head);

        System.out.println(sb);
    }

    private static void back(Node head) {
        if(head == null) return;
        back(head.left);
        back(head.right);
        sb.append(head.name);
    }

    private static void mid(Node head) {
        if(head == null) return;
        mid(head.left);
        sb.append(head.name);
        mid(head.right);
    }

    private static void front(Node head) {
        if(head == null) return;
        sb.append(head.name);
        front(head.left);
        front(head.right);
    }

    static class Node{
        String name;
        Node left;
        Node right;

        public Node(String name) {
            this.name = name;
        }
    }
}