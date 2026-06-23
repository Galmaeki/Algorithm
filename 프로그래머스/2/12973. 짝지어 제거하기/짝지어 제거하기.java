import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(st.empty()) st.push(s.charAt(i));
            else {
                Character ch = s.charAt(i);
                
                if (st.peek().equals(ch)) st.pop();
                else st.push(ch);
            }
        }

        return st.empty()?1:0;
    }
}