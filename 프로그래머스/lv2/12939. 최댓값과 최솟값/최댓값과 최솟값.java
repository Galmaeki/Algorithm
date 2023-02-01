class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int answer[] = {Integer.MAX_VALUE,Integer.MIN_VALUE};//0번 최소, 1번 최대
        int sign =1;//음수,양수 구분용 기호
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='-'||s.charAt(i)>47&&s.charAt(i)<58)
                sb.append(s.charAt(i));
            if(s.charAt(i)==32||i==s.length()-1)
            {
                answer[0]=Math.min(answer[0],Integer.parseInt(sb.toString()));
                answer[1]=Math.max(answer[1],Integer.parseInt(sb.toString()));
                sb.delete(0,sb.length());
            }
            
        }
        return ""+answer[0]+' '+answer[1];
    }
}