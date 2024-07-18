import java.util.LinkedList;
import java.util.Queue;

class Solution {

    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long sum1 = 0;
        long sum2 = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for (int i : queue1) {
            sum1 += i;
            q1.add(i);
        }
        for (int i : queue2) {
            sum2 += i;
            q2.add(i);
        }

        if((sum2 + sum1) %2 == 1) return -1;

        while(true){
            if(answer>(queue1.length + queue2.length)*2) return -1;
            if(sum2 == sum1) break;
            if(sum2>sum1){
                int n = q2.peek();
                sum2-= n;
                sum1+= n;
                q1.add(q2.poll());
            }else{
                int n = q1.peek();
                sum1-= n;
                sum2+= n;
                q2.add(q1.poll());
            }
            answer++;
        }


        return answer;
    }
}