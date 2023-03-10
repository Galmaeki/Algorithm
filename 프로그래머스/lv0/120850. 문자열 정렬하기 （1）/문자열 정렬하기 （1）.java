import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> al = new ArrayList();
        for(int i=0;i<my_string.length();i++){
            if(my_string.charAt(i)>=48&&my_string.charAt(i)<=57){
            al.add(my_string.charAt(i)-'0');
            }
        }
        Collections.sort(al);
        int[] arr = new int[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i] = al.get(i);
        }
        return arr;
    }
}