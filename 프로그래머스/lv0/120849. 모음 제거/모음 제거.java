class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<my_string.length();i++){
            if(my_string.charAt(i)==97||my_string.charAt(i)==101||my_string.charAt(i)==105||my_string.charAt(i)==111||my_string.charAt(i)==117){
            }else{
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}