class Solution {
    public int solution(int[] list) {
        int odd = 0;
        int even = 0;
        for(int i = 0;i<list.length;i++){
            if(i%2==0){
                even+=list[i];
            }else{
                odd+=list[i];
            }
        }
        return even>=odd?even:odd;
    }
}