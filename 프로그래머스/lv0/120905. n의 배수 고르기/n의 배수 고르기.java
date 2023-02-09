import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> al = new ArrayList();
        for(int i =0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                al.add(numlist[i]);
            }
        }
        int[] arr = new int[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        return arr;
    }
}