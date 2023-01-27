import java.util.*;
class Solution {
    public String solution(int a, int b) {
        Calendar cal = Calendar.getInstance();
        cal.set(2016,a-1,b);
        switch (cal.get(Calendar.DAY_OF_WEEK)){
            case 1:return "SUN";//일
            case 2:return "MON";//월
            case 3:return "TUE";//화//6이 금요일이 되어야함
            case 4:return "WED";//수
            case 5:return "THU";//목
            case 6:return "FRI";//금 //1월 1일
            case 7:return "SAT";//토
            default: return "";
        }
}
}