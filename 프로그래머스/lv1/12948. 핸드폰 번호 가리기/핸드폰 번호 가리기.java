class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        int a=0;
        for(int i =0;i<=phone_number.length()-4;i++){
            sb.append('*');
            a=i;
        }
        for(int i =a;i<a+4;i++){
        sb.append(phone_number.charAt(i));
        }
        if(sb.charAt(0)=='*')
            sb.delete(0,1);
        return sb.toString();
    }
}