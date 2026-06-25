import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> q1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> q2 = new LinkedList<>(Arrays.asList(cards2));
        Queue<String> q3 = new LinkedList<>(Arrays.asList(goal));

        while (!q3.isEmpty()){
            if(!q1.isEmpty()&&q1.peek().equals(q3.peek())){
                q1.poll();
                q3.poll();
            } else if (!q2.isEmpty()&&q2.peek().equals(q3.peek())) {
                q2.poll();
                q3.poll();
            }else {
                break;
            }
        }
        return q3.isEmpty() ?"Yes":"No";
    }
}