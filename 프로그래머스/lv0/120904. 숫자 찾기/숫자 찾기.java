class Solution {
    public int solution(int num, int k) {
        String str = ""+num;
        int answer = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==(k+48))
            {    answer=i+1;
             break;
            }
        }
        if(answer==0)
            return -1;
        return answer;
    }
}