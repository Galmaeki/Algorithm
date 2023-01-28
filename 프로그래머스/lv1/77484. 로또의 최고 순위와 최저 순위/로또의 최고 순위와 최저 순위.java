class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];//0번이 최고등수 1번이 최저등수
        int zeroCount = 0;
        int winCount = 7;
        for (int i=0;i<lottos.length;i++){
            if(lottos[i]==0)
                zeroCount++;//0이 몇개나 있는지 카운트
        }
        for (int i = 0; i < win_nums.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if(lottos[j]==win_nums[i])
                {
                    winCount--;
                    break;
                }
            }
        }
        answer[0]=winCount-zeroCount;
        if (answer[0]==7)
            answer[0]=6;
        answer[1]=winCount;
        if (answer[1]==7)
            answer[1]=6;
        return answer;
}}