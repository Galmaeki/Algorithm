class Solution {
    public long solution(int price, int money, int count) {
        long need = 0;
        for(int i=count;i>0;i--){
            need+=price*i;
        }
        return (money-need)>0?0:(money-need)*-1;
    }
}