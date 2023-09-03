import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            check(br.readLine());
        }
    }

    public static void check(String s) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                st.push(0);
            }else{
                try{
                st.pop();
                }catch (Exception e){
                    System.out.println("NO");
                    break;
                }
            }
            if(i==s.length()-1){
                if(st.size()==0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }

            }
        }

    }

}