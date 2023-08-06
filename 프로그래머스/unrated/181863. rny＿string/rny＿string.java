import java.util.*;

class Solution {
    public String solution(String rny_string) {
        StringBuilder sb = new StringBuilder();
        for(int a=0;a<rny_string.length();a++){
            if(rny_string.charAt(a)=='m'){
                sb.append("rn");
            }else{
                sb.append(rny_string.charAt(a));
            }
        }
        return sb.toString();
    }
}