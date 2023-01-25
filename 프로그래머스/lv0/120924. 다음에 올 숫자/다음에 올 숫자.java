class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int first = common[0];
        int second = common[1];
        int last = common[common.length-1];
        int last_1=common[common.length-2];
        if (first - second == last_1-last){
            answer = (second - first)+last;
        }
        else {
            answer = (second/first)*last;
        }
        return answer;
    }
}