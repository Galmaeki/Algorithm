import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
            Stack<Integer> st = new Stack<>();
            st.push(arr[0]);
            for(int i =1;i<arr.length;i++){
                if(st.peek()!=arr[i]){
                    st.push(arr[i]);
                }
            }
            //System.out.println(st);
            int answer[] = new int[st.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i]=st.pop();
            }
            int[] answer1 = new int[answer.length];
        for (int j=answer.length-1, i = 0;i<answer.length;i++,j--){
            answer1[i]=answer[j];
        }
            return answer1;
    }
}