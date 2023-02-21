import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] set = new boolean[10];
        Arrays.fill(set,true);
        for (int i=0;i<numbers.length;i++){
            set[numbers[i]]=false;
        }
        for(int i=0;i<10;i++){
            if(set[i])
            answer+=i;
        }
        return answer;
    }
}