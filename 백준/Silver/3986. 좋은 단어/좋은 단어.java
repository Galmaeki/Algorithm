import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            Stack<Character> st = new Stack<>();

            if (s.length() % 2 == 1) continue;
            
            st.push(s.charAt(0));
            for (int j = 1; j < s.length(); j++) {
                if (!st.isEmpty() && st.peek() == s.charAt(j)) st.pop();
                else st.push(s.charAt(j));
            }
            if (st.empty()) ans++;
        }
        System.out.println(ans);
    }
}