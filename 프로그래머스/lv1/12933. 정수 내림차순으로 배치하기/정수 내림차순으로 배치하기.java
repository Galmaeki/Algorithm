import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList arr = new ArrayList<Long>();
        int div=0;
        while(n>=10)
        {
            arr.add(n%10);
            n=n/10;
            div++;
        }arr.add(n);
        arr.sort(Comparator.reverseOrder());
        for(int i =0;i<div;i++)
        {
            answer +=(long)(arr.get(i));
            answer=answer*10;
        }answer+=(long)(arr.get(div));
        return answer;
    }
}