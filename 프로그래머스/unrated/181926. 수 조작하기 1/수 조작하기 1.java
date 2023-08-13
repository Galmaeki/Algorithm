class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char[] cha = control.toCharArray();
        for(char a :cha){
            if(a=='w'){
                answer+=1;
            }else if(a=='s'){
                answer-=1;
            }else if(a=='d'){
                answer+=10;
            }else if(a=='a'){
                answer-=10;
            }
        }
        return answer;
    }
}