class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i =0;i<s.length();i++){
            if(s.charAt(i)>64&&s.charAt(i)<91){
                if (s.charAt(i)+n>90){
                    sb.append((char)(s.charAt(i)+n-26));
                } else{
                    sb.append((char)(s.charAt(i)+n));
                }
            }//여기까지 대문자 로직
            else if(s.charAt(i)>96&&s.charAt(i)<123){
                if (s.charAt(i)+n>122){
                    sb.append((char)(s.charAt(i)+n-26));
                } else{
                    sb.append((char)(s.charAt(i)+n));
                }
            }else{
            sb.append(s.charAt(i));
        }}
        return sb.toString();
    }
}
/*
스트링빌더를 사용하자
값을 초과한 범위가 나왔을 경우엔 26만큼 빼줄예정
*/