class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        for (int i =0;i<s.length();i++){
            s.charAt(i);
            if (index==0||index%2==0){
                answer+=Character.toUpperCase(s.charAt(i));
            }else
            {
                 answer+=Character.toLowerCase(s.charAt(i));
            }
            index++;
            if (s.charAt(i)==' ') {
                index=0;
            }
        }
        return answer;
    }
}