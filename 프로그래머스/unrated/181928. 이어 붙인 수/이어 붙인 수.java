import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        StringBuilder sbOdd = new StringBuilder();
        StringBuilder sbEven = new StringBuilder();
        for(int num:num_list){
            if(num%2==0){
                sbEven.append(num);
            }else{
                sbOdd.append(num);
            }
        }
        return Integer.parseInt(sbEven.toString())+Integer.parseInt(sbOdd.toString());
    }
}