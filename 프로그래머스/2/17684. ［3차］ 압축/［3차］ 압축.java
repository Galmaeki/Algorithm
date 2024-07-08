import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String msg) {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            hm.put((char)(65+i) + "",i+1);
        }
        int count = 27;

        for (int i = 0; i < msg.length(); i++) {
            String a = msg.charAt(i) + "";
            while (hm.containsKey(a) && i + 1 < msg.length()) {
                i++;
                a = a + msg.charAt(i);
            }
            if (!hm.containsKey(a)) {
                hm.put(a, count);
                count++;
                a = a.substring(0, a.length() - 1);
                i--;
            }
            al.add(hm.get(a));
        }

        int[] answer = new int[al.size()];

        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }

        return answer;
    }
}