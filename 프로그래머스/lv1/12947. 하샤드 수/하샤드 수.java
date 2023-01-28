class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int fx = x;
        while(fx>=10){
            sum+=fx%10;
            fx=fx/10;
        }sum+=fx;
        if (x%sum==0){
            return true;
        }else{
            return false;
        }
    }
}