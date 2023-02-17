class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] answer = my_string.toCharArray();
        char tmp = my_string.charAt(num2);
        answer[num2]=answer[num1];
        answer[num1]=tmp;
        String ans = new String(answer);
        return ans;
    }
}