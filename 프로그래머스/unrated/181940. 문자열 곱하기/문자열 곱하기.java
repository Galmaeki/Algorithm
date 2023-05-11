import java.util.*;

class Solution {
    public String solution(String my_string, int k) {
        String answer = my_string;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<k;i++){
            sb.append(answer);
        }
        return sb.toString();
    }
}