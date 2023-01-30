import java.util.ArrayList;
import java.util.Iterator;
class Solution {
    public int solution(int[] nums) {
        ArrayList<Integer> hs = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                for(int k = j+1;k<nums.length;k++){

                    hs.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }
        System.out.println(hs);
        int n = 0,answer = hs.size(),count;
        Iterator<Integer> hi = (Iterator) hs.iterator();
        while (hi.hasNext()){
            n=hi.next();
            count=0;
            for (int i = 1; i <= n; i++) {
                if(n%i==0){
                    count++;
                }
                if(count>=3){//소수가 아니면 나가야지
                    answer--;
                    break;
                }
            }

        }
        return answer;
    }
}