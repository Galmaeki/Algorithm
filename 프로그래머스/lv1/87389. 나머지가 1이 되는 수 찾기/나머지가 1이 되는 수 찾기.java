class Solution {
    public int solution(int n) {
        int answer=9999999;
        for (int i =n;i>0;i--){
            if(n%i==1){
                answer=Math.min(answer,i);
            }
        }
        return answer;
    }
}