import java.util.*;

class Solution {
    public int[] solution(int start, int end) {
        ArrayList<Integer> al = new ArrayList();
        for(int i=start;i>=end;i--){
            al.add(Integer.valueOf(i));
        }
        int[] a = new int[al.size()];
        for(int i=0;i<al.size();i++){
            a[i]=al.get(i);
        }
        return a;
    }
}