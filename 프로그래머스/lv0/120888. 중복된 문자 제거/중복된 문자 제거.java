import java.util.*;
class Solution {
    public String solution(String my_string) {
        HashSet<Character> hs = new HashSet();
        char[] ar = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<ar.length;i++){
            hs.add(ar[i]);
        }
        for(int i=0;i<ar.length;i++){
            if(hs.contains(ar[i]))
            {
                sb.append(ar[i]);
                hs.remove(ar[i]);
            }
        }
        return sb.toString();
    }
}