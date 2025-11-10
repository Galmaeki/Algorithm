import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Node> qu = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean flag = false;
        long t = 0;

        long n = Integer.parseInt(st.nextToken());
        long fin = Integer.parseInt(st.nextToken());

        qu.add(new Node(n,1));

        while(!qu.isEmpty()){
            Node node = qu.poll();

            if(node.v==fin) {
                flag = true;
                t = node.t;
                break;
            }

            if(node.v*2<=fin) qu.add(new Node(node.v*2, node.t+1));
            if((node.v*10)+1<=fin) qu.add(new Node((node.v*10)+1, node.t+1));

            }
        if(!flag) System.out.println(-1);
        else System.out.println(t);
        }
    }

    class Node{
        long v;
        long t;
        Node(long v,long t){
            this.v = v;
            this.t = t;
        }
    }
