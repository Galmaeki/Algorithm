import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> st = new Stack<>();
        int count = Integer.parseInt(br.readLine());

        String[] str = new String[count];

        for (int i = 0; i < count; i++) {
            str[i]=br.readLine();
        }

        for(String s : str){
            if(s.startsWith("push")){
                st.push(s.substring(5));
            }
            if(s.equals("pop")){
                if(st.size()!=0)
                    System.out.println(st.pop());
                else
                    System.out.println(-1);
            }
            if(s.equals("size")){
                System.out.println(st.size());
            }
            if(s.equals("empty")){
                System.out.println(st.size()==0?1:0);
            }
            if(s.equals("top")){
                System.out.println(st.size()==0?-1:st.peek());
            }
        }
    }
}