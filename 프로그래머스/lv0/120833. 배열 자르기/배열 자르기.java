import java.util.ArrayList;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
            
        ArrayList<Integer> al = new ArrayList();
        for (int i =num1;i<=num2;i++){
            al.add(numbers[i]);
        }
        int answer[] = new int[al.size()];
       for (int i =0;i<al.size();i++){
           answer[i]=al.get(i);
       }
        return answer;
    }
}