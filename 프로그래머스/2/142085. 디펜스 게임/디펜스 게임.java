import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : enemy) {
            n -= i;
            pQ.add(i);
            if (n < 0) {
                if (k > 0) {
                   k--;
                    n += pQ.poll();
                } else {
                    break;
                }
            }
            answer++;
        }

        return answer;
    }
}