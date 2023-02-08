import java.util.*;
class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> al =new ArrayList();
        while(age>9){
            al.add((char)((age%10)+48));
            age=age/10;
        }
        al.add((char)((age)+48));
        for(int i =al.size()-1;i>=0;i--){
            sb.append((char)(al.get(i)+49));
        }
        return sb.toString();
    }
}