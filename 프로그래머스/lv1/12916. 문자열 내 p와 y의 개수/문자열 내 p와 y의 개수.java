class Solution {
    boolean solution(String s) {
        int p=0,y=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==112||s.charAt(i)==80)
                p++;
            if(s.charAt(i)==89||s.charAt(i)==121)
                y++;
        }
        if(p==y)
            return true;       
        return false;
    }
}