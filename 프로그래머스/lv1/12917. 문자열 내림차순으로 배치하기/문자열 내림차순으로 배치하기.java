import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Character> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            al.add(s.charAt(i));
        }
        al.sort(Comparator.reverseOrder());
        for (int i = 0; i < al.size(); i++) {
            sb.append(al.get(i));
        }
        return sb.toString();
    }
}