import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            for (int i =0;i<commands.length;i++){
                if(commands[i][0]==commands[i][1]) {
                    list2.add(array[commands[i][0]-1]);
                continue;
                }
                for(int j=commands[i][0]-1;j<=commands[i][1]-1;j++){
                    list1.add(array[j]);
                }
                Collections.sort(list1);
                list2.add(list1.get(commands[i][2]-1));
                list1.clear();
            }
            int[] answer = new int[list2.size()];
            for(int i=0;i<list2.size();i++){
                answer[i]=list2.get(i);
            }
            return answer;
    }
}