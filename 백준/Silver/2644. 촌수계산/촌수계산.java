import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        Integer size = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        visit = new boolean[size];

        Integer start = Integer.parseInt(st1.nextToken())-1;
        Integer end = Integer.parseInt(st1.nextToken())-1;

        for (int i = 0; i < size; i++) {
            arr.add(new ArrayList<>());
        }

        Integer c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            Integer a = Integer.parseInt(st.nextToken())-1;
            Integer b = Integer.parseInt(st.nextToken())-1;

            arr.get(a).add(b);
            arr.get(b).add(a);
        }

        System.out.println(bfs(start, end));
    }

    private static int bfs(Integer start, Integer end) {
        Queue<Node> qu = new LinkedList<>();

        qu.add(new Node(start, 0));
        visit[start] = true;

        while (!qu.isEmpty()){
            Node node = qu.poll();
            visit[node.a] = true;
            if(node.a == end){
                return node.c;
            }
            ArrayList<Integer> list = arr.get(node.a);

            for (Integer i : list) {
                if(!visit[i]){
                    qu.add(new Node(i,node.c+1));
                }
            }
        }

        return -1;
    }

    static class Node{
        int a;
        int c;
        Node(int a, int c){
            this.a = a;
            this.c = c;
        }
    }
}