import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb =new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (!(line = br.readLine()).equals(".")) {
            sb.append(check(line)?"yes":"no").append("\n");
        }

        System.out.print(sb);
    }

    private static boolean check(String line) {
        Stack<Boolean> st = new Stack<>();

        for (char c : line.toCharArray()) {
            if(c=='['){
                st.push(true);
            }
            if(c=='('){
                st.push(false);
            }
            if(c==']'){
                if(st.size()==0||!st.peek())
                    return false;
                else
                    st.pop();
            }
            if(c==')'){
                if(st.size()==0||st.peek())
                    return false;
                else
                    st.pop();
            }
        }

        if(st.size()!=0)
            return false;

        return true;
    }
}