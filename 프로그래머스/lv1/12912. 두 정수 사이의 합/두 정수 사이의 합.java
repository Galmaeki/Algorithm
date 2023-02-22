class Solution {
    public long solution(int a, int b) {
        long answer=0;
        int mx=Math.max(a,b);
        int mn=Math.min(a,b);
        for(long i=mn;i<=mx;i++){
            answer+=i;
        }
        return answer;
    }
}