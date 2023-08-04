class Solution {
    public int solution(int[] num_list) {
        int a =0;
        if(num_list.length<11){
            a=1;
           for(Integer i:num_list){
                a=i*a;
            }
        } else{
             for(Integer i:num_list){
                a+=i;
            }
        }
        return a;
    }
}