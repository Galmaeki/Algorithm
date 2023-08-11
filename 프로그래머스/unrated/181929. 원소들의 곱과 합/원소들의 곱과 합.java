class Solution {
    public int solution(int[] num_list) {
        int sum=0;
        int mul=1;
        for(int a:num_list){
            sum+=a;
            mul*=a;
        }
        return mul<sum*sum?1:0;
    }
}