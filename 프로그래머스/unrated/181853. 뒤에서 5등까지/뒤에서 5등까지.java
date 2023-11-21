import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
        //배열을 기본적으로 오름차순으로 정렬해줌
        answer[0]= num_list[0];
        answer[1]= num_list[1];
        answer[2]= num_list[2];
        answer[3]= num_list[3];
        answer[4]= num_list[4];
        return answer;
    }
}