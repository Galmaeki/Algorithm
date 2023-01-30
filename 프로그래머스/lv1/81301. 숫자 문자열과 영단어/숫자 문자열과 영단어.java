import java.util.*;
class Solution {
    public int solution(String s) {
         long answer = 0;
        ArrayList<Character> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i =0;i<s.length();i++){
            if(s.charAt(i)>=48&&s.charAt(i)<=58){
                al.add(s.charAt(i));
            }else {
                for(int j=i;j<s.length();j++){
                    if(s.charAt(j)>=48&&s.charAt(j)<=58){
                        i=j-1;
                        break;
                    }
                    sb.append(s.charAt(j));
                    if (sb.toString().equals("zero")){
                        al.add((char)48);
                        sb.delete(0,sb.length());
                    } else if (sb.toString().equals("one")) {
                        al.add((char)49);
                        sb.delete(0,sb.length());
                    }else if (sb.toString().equals("two")) {
                        al.add((char)50);
                        sb.delete(0,sb.length());
                    }else if (sb.toString().equals("three")) {
                        al.add((char)51);
                        sb.delete(0,sb.length());
                    }else if (sb.toString().equals("four") ){
                        al.add((char)52);
                        sb.delete(0,sb.length());
                    }else if (sb.toString().equals("five") ){
                        al.add((char)53);
                        sb.delete(0,sb.length());
                    }else if (sb.toString().equals("six") ){
                        al.add((char)54);
                        sb.delete(0,sb.length());
                    }else if (sb.toString().equals("seven")) {
                        al.add((char)55);
                        sb.delete(0,sb.length());
                    }else if (sb.toString().equals("eight") ){
                        al.add((char)56);
                        sb.delete(0,sb.length());
                    }else if (sb.toString().equals("nine") ){
                        al.add((char)57);
                        sb.delete(0,sb.length());
                    }
                }

            }
        }
        System.out.println(al);
        for (int i = 0; i < al.size(); i++) {
            answer+=(al.get(i)-48);
            answer=answer*10;
        }
        answer=answer/10;
        return (int)answer;
    }
}
/*
크기가 얼마나 될 지 모르니 일단 숫자 하나하나씩 저장할 어레이리스트를 만들고
추출한 문자를 넣을 스트링빌더 생성
포문 시작
스트링 차앳 i 가 숫자인지 판별하는 이프문
숫자라면 그대로 어레이리스트에 추가
문자라면 이중포문 시작 초기화는 i에서부터 s의 끝까지
i가 문자라면 스트링빌더에 넣어줌 숫자라면 넣지안고 break로 탈출
스위치문을 이용해 스트링빌더와 일치하는 케이스의 숫자를 어레이리스트에 추가

모두 끝나면 포문을 어레이리스트의 사이즈만큼 반복
앤서=어레이리스트 겟 i 
만약에 어레이리스트사이즈-1의 숫자가 들어오면 브레이크
엘스 앤서=*10
*/