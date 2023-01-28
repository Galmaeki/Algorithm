import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        for (int i =0;i<sizes.length;i++){
            Arrays.sort(sizes[i]);
        }
        int amax=0,bmax=0;
        for (int i =0;i<sizes.length;i++){
            amax=Math.max(sizes[i][0],amax);
            bmax=Math.max(sizes[i][1],bmax);
        }
        return amax*bmax;
    }
}