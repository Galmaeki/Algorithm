class Solution {
    public long solution(long n) {
        long num = (long)(Math.sqrt(n));
        if(num*num==n){
            num++;
            return num*num;
        }
        else{
         return -1;   
        }
    }
}