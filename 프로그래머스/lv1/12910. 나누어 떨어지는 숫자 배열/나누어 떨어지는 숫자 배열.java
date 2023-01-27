import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count =0;
        for (int i =0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                count++;
            }
        }
        if (count==0){
            int answer[]={-1};
            return answer;
        }
        int count2=0;
        int answer[] = new int[count];
        for (int i =0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                answer[count2]=arr[i];
                count2++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}