class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
       int leftmax = -256,leftmin = 256;
        int rightmax = -256, rightmin=256;
        int width=0, height=0;
        for (int i =0;i<dots.length;i++){
                leftmax = Math.max(dots[i][0],leftmax);
                leftmin = Math.min(dots[i][0],leftmin);
                rightmax = Math.max(dots[i][1],rightmax);
                rightmin = Math.min(dots[i][1],rightmin);
        }
        width = leftmax-leftmin;
        height= rightmax-rightmin;
        answer = width*height;
        return answer;
    }
}