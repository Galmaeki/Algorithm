import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> qu = new LinkedList<>();

        int num = Integer.parseInt(br.readLine());
        String[] st = new String[num];

        for (int i=0;i<num;i++) {
            st[i]=br.readLine();
        }

        for (String s : st) {
            if(s.startsWith("push")){
                qu.offer(Integer.parseInt(s.substring(5)));
            }
            if(s.equals("pop")){
                if(qu.size()!=0){
                    System.out.println(qu.poll());
                }else {
                    System.out.println(-1);
                }
            }
            if(s.equals("size")){
                System.out.println(qu.size());
            }
            if(s.equals("empty")){
                System.out.println(qu.size()==0?1:0);
            }
            if(s.equals("front")){
                System.out.println(qu.peek()==null?-1:qu.peek());
            }if(s.equals("back")){
                System.out.println(((LinkedList<Integer>) qu).peekLast()==null?-1:((LinkedList<Integer>) qu).peekLast());
            }
        }
    }
}