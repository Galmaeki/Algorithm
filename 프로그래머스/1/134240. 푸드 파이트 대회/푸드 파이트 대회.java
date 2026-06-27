import java.util.Stack;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < food.length; i++) {
            if(food[i]%2==1) food[i] -=1;
            for (int j = 0; j < food[i] / 2; j++) {
                sb.append(i);
                st.add(i);
            }
        }

        sb.append(0);

        while (!st.empty()) sb.append(st.pop());

        return sb.toString();
    }
}