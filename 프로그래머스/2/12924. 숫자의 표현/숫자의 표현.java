class Solution {
    public int solution(int n) {
        int answer = 0;
        int l = 1,r = 1,tmp = 1;
        while (l<=n){
            if(tmp == n) {
                answer++;
                tmp-=l;
                l++;
            } else if (tmp<n) {
                r++;
                tmp+=r;
            }else{
                tmp-=l;
                l++;
            }
        }
        return answer;
    }
}