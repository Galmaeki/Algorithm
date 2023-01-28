class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n<=2) return n;
        String str = "";
        while(true){
            str+=n%3;
            n=n/3;
            if(n<3){break;}
        }str+=n;
        System.out.println(str);
        int x=1;
        for (int i = str.length(); i > 0; i--) {
            answer+=((str.charAt(i-1))-48)*x;
            x=x*3;
        }
        return answer;
    }
}