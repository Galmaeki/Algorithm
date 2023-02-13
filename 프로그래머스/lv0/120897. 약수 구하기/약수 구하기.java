import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> al = new ArrayList();
        int j=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                al.add(i);
        }
        int[] answer=new int[al.size()];
        for(int a:al){
            answer[j]=al.get(j);
            j++;
        }
        return answer;
    }
}