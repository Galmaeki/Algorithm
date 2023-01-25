class Solution {
    public int solution(int angle) {
        int answer = 0;
        if (angle == 180) {return 4;}
        else if (angle ==90) {return 2;}
        else {answer = angle<90? 1:3;}
    return answer;
    }
}