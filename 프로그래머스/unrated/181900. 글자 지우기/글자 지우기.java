import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        boolean[] re = new boolean[my_string.length()];
        StringBuilder sb = new StringBuilder();
        for (Boolean b : re) {
            b=false;
        }
        for(Integer a : indices) {
            re[a]=true;
        }
        for(int i = 0;i<re.length;i++) {
            if(!re[i]){
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}