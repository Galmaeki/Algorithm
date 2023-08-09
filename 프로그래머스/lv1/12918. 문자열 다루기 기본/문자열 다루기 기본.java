class Solution {
    public boolean solution(String s) {
        if(!(s.length()==4||s.length()==6)){
            return false;
        }
        try{
        Long.parseLong(s);
            return true;
        }catch(Exception e){
         return false;   
        }
    }
}