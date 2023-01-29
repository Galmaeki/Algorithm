class Solution {
    public int solution(int n) {
        int sum = 0;
        while(n>=10){
            sum += n%10;
            n=n/10;
        }sum+=n;
        return sum;
    }
}