import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Stack<Integer> st = new Stack<>();
        boolean impossible = false;
        int start = 1;
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int target = Integer.parseInt(br.readLine());

            if (target >= start) {
                while (target >= start) {
                    st.push(start);
                    sb.append("+").append("\n");
                    
                    start++;
                }

                st.pop();
                sb.append("-").append("\n");
            } else {
                if (st.pop() > target) {
                    impossible = true;
                    break;
                } else sb.append("-").append("\n");
            }
        }

        System.out.println(impossible ? "NO" : sb);
    }
}