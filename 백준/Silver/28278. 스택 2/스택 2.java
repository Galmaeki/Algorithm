import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        String[] str = new String[count];

        for (int i = 0; i < count; i++) {
            str[i]=br.readLine();
        }

        for(String s : str){
            if(s.startsWith("1 ")){
                st.push(s.substring(2));
            }
            if(s.equals("2")){
                if(st.size()!=0)
                    sb.append(st.pop()).append("\n");
                else
                    sb.append(-1).append("\n");
            }
            if(s.equals("3")){
                sb.append(st.size()).append("\n");
            }
            if(s.equals("4")){
                sb.append(st.size()==0?1:0).append("\n");
            }
            if(s.equals("5")){
                sb.append(st.size()==0?-1:st.peek()).append("\n");
            }
        }
        System.out.print(sb);
    }
}