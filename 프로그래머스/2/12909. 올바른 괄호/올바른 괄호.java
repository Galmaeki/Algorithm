import java.util.*;

class Solution {
    boolean solution(String s) {
        Queue qu = new LinkedList<Integer>();
        for(char c:s.toCharArray()){
            if('('==c) qu.add(0);
            else if(')'==c&&qu.size()!=0) qu.poll();
            else return false;
        }
        return qu.size()==0?true:false;
    }
}