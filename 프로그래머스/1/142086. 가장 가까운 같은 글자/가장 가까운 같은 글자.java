import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] a = new int[26];

        Arrays.fill(a, -1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(a[c-97]!=-1){
                answer[i] = i-a[c-97];
                a[c-97] = i;
            }else{
                answer[i] = -1;
                a[c-97] = i;
            }
        }

        return answer;
    }
}