import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet();
        int pkm = nums.length/2;
        for (int i =0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        if(pkm<=hs.size())
            return pkm;
        return hs.size();
    }
}