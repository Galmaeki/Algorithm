import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList();
        for(String a : strArr){
            if(!a.contains("ad")){
                answer.add(a);
            }
        }
        return answer.toArray(new String[answer.size()]);
    }
}