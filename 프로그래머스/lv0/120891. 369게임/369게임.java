class Solution {
    public int solution(int order) {
        int answer =0;
        while(order>9){
            if(order%10==3||order%10==6||order%10==9){
                answer++;
            }
            order=order/10;
        }
        if(order%10==3||order%10==6||order%10==9){
                answer++;
            }
        return answer;
    }
}