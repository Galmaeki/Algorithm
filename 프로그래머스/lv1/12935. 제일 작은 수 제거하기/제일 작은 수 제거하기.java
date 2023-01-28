import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length==1){
            int answer[] = {-1};
            return answer;
        }
        int[] ar = arr.clone();
        int answer[]=new int[arr.length-1];
        Arrays.sort(ar);
        int min = ar[0];
        int j = 0;
        for (int i=0;i<answer.length;i++){
            if(arr[i]==min)
            {
                j++;
            }
            answer[i]=arr[j];
            j++;
        }        
        
        return answer;
    }
}