class Solution {
    public String solution(String my_string) {
        String answer = "";
        int text = my_string.length();
        for (int i =text;i>0;i--){
            answer=answer+my_string.charAt(i-1)   ;         
        }
        return answer;
    }
}