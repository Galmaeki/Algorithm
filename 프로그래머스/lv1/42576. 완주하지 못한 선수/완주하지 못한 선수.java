import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for (String part:participant) {//접수자를 넣엇슴
            if(hm.containsKey(part)){
                hm.put(part, hm.get(part) + 1);
            }else {
                hm.put(part, 1);
            }
        }
        for (String compl:completion){//완주자를 빼야함
            hm.put(compl,hm.get(compl) - 1);
        }
        for (String ans:participant){
            if(hm.get(ans)==1)
                return ans;
        }
        return answer;
    }
}