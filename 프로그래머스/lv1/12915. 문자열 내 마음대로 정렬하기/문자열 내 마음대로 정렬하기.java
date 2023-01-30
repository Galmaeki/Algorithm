import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
       /* Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.charAt(n) == s2.charAt(n)) {
                    return s1.compareTo(s2);
                } else {
                    return s1.charAt(n) - s2.charAt(n);
                }
            }
        });
        return strings;
        *///진짜 어이가 없네.... 
        ArrayList<String> al = new ArrayList<>();
        for(int i =0;i<strings.length;i++){
            al.add(strings[i].charAt(n)+strings[i]);
            }
        Collections.sort(al);
        String answer[] = new String[strings.length];
        for(int i =0;i<strings.length;i++){
            answer[i] = al.get(i).substring(1);

        }
        return answer;
    }
}